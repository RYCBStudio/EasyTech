package com.rycb.etech.items.single;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/4 10:48</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.single/EnchantedGoldenCarrot.java</p>
 * <h1><center>EnchantedGoldenCarrot</center></h1>
 */
public class EnchantedGoldenCarrot extends ItemFood implements IHasModel {

    public EnchantedGoldenCarrot() {
        super(3, 8.4f, false);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 100 * 20, 3));
        player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20 * 20, 1));
        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5 * 60 * 20));
        player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5 * 60 * 20));
    }
}
