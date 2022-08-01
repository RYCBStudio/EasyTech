package com.rycb.etech.items.base;

import com.rycb.etech.food.EffectFoodBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.PotionEffect;

import javax.annotation.Nullable;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/7/30 14:37</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.base.singleitem/ItemFolkPrescription.java</p>
 * <h1><center>Folk Prescriptions</center></h1>
 */
public class ItemFolkPrescription extends EffectFoodBase {

    public ItemFolkPrescription(int meta, int amount, float saturation, boolean isWolfFood, CreativeTabs tab, PotionEffect effect1, @Nullable PotionEffect effect2, @Nullable PotionEffect effect3) {
        super("folkPsn" + meta, "folk_psn_" + meta, amount, saturation, isWolfFood, tab, effect1, effect2, effect3);
        setMaxStackSize(48);
    }

}
