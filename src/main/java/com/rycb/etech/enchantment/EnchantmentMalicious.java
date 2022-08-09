package com.rycb.etech.enchantment;

import com.rycb.etech.init.ModEnchantments;
import com.rycb.etech.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ISpecialArmor;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/8 12:49</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.enchantment/EnchantmentMalicious.java</p>
 * <h1><center>EnchantmentMalicious</center></h1>
 */
public class EnchantmentMalicious extends Enchantment {
    
    public EnchantmentMalicious() {
        super(Rarity.UNCOMMON, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[]{EntityEquipmentSlot.CHEST});
        this.setName("malicious");
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":malicious"));
        ModEnchantments.ENCHANTNENTS.add(this);
    }
    
    public static boolean shouldHit(int level, Random rand) {
        if (level <= 0) {
            return false;
        } else {
            return rand.nextFloat() < 0.15f * (float) level;
        }
    }
    
    public static int getDamage(int level, Random rand) {
        return level > 10 ? level - 10 : 1 + rand.nextInt(2);
    }
    
    protected void addEffect(EntityLivingBase user) {
        user.removePotionEffect(MobEffects.POISON);
        user.removePotionEffect(MobEffects.WITHER);
        user.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 120 * 20, 3, true, false));
        user.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 120 * 20, 3, true, false));
        user.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 120 * 20, 5, true, false));
        
    }
    
    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 20 * enchantmentLevel;
    }
    
    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return this.getMinEnchantability(enchantmentLevel) + 10;
    }
    
    @Override
    public int getMaxLevel() {
        return 10;
    }
    
    protected boolean conApplyTogether(Enchantment enchantment) {
        return super.canApplyTogether(enchantment) && enchantment != Enchantments.THORNS;
    }
    
    public void onUserHit(EntityLivingBase user, Entity attacker, int level) {
        Random random = user.getRNG();
        ItemStack stack = EnchantmentHelper.getEnchantedItem(ModEnchantments.ENCHANTMENT_MALICIOUS, user);
        if (shouldHit(level, random)) {
            if (attacker != null) {
                attacker.attackEntityFrom(DamageSource.causeThornsDamage(user), (float) getDamage(level, random) * 5);
                addEffect(user);
            } else if (!stack.isEmpty()) {
                damageWeapon(stack, 2, user);
                addEffect(user);
            } else {
                addEffect(user);
            }
        }
    }
    
    private void damageWeapon(ItemStack stack, int amount, EntityLivingBase entity) {
        int slot = -1;
        int x = 0;
        for (ItemStack i : entity.getArmorInventoryList()) {
            if (i == stack) {
                slot = x;
                break;
            }
            x++;
        }
        if (slot == -1 || !(stack.getItem() instanceof ISpecialArmor)) {
            stack.damageItem(1, entity);
            return;
        }
        ISpecialArmor armor = (ISpecialArmor) stack.getItem();
        armor.damageArmor(entity, stack, DamageSource.causeThornsDamage(entity), amount, slot);
    }
}
