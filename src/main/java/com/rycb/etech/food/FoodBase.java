package com.rycb.etech.food;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/7/27 20:17</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.food/FoodBase.java</p>
 * <h1><center>FoodBase</center></h1>
 */
public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String UnlocalizedName, String RegistryName, int amount, float saturation, boolean isWolfFood, CreativeTabs tab) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName("food" + UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName("food_" + RegistryName);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
