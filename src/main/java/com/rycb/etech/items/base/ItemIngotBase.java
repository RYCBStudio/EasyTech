package com.rycb.etech.items.base;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIngotBase extends Item implements IHasModel {

    public ItemIngotBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName("ingot" + UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName + "_ingot");
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
