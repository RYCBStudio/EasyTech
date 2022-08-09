package com.rycb.etech.items.single.cheating;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/8 20:05</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.single.cheating/Panacea.java</p>
 * <h1><center>Panacea</center></h1>
 */

public class Panacea extends ItemFood implements IHasModel {
    
    protected Potion[] Debuff = new Potion[]{MobEffects.WITHER, MobEffects.BLINDNESS, MobEffects.HUNGER, MobEffects.LEVITATION, MobEffects.UNLUCK, MobEffects.NAUSEA, MobEffects.MINING_FATIGUE, MobEffects.WEAKNESS, MobEffects.POISON};
    protected Potion[] Buff = new Potion[]{MobEffects.SATURATION, MobEffects.LUCK, MobEffects.FIRE_RESISTANCE, MobEffects.HASTE, MobEffects.RESISTANCE, MobEffects.STRENGTH, MobEffects.ABSORPTION, MobEffects.REGENERATION, MobEffects.HEALTH_BOOST, MobEffects.WATER_BREATHING, MobEffects.SPEED, MobEffects.JUMP_BOOST, MobEffects.NIGHT_VISION, MobEffects.INVISIBILITY};
    
    public Panacea() {
        super(2147483647, 2147483647.2147483647f, true);
        setAlwaysEdible();
        setRegistryName("panacea");
        setUnlocalizedName("panacea");
        setCreativeTab(EasyTech.ETECH_TAB);
        ModItems.ITEMS.add(this);
    }
    
    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        for (Potion p : Debuff) {
            player.removePotionEffect(new PotionEffect(p).getPotion());
        }
        for (Potion p : Buff) {
            if (p == MobEffects.JUMP_BOOST) {
                player.addPotionEffect(new PotionEffect(p, 1000000, 2));
                continue;
            } else if (p == MobEffects.SPEED) {
                player.addPotionEffect(new PotionEffect(p, 1000000, 3));
                continue;
            }
            player.addPotionEffect(new PotionEffect(p, 1000000, 255));
        }
    }
}
