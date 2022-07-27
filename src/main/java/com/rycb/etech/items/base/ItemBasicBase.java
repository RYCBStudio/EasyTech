package com.rycb.etech.items.base;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasicBase extends Item implements IHasModel {

    public ItemBasicBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
