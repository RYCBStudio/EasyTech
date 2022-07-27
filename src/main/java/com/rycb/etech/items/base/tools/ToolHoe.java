package com.rycb.etech.items.base.tools;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {
    public ToolHoe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("hoe"+UnlocalizedName);
        setRegistryName(RegistryName+"_hoe");
        setCreativeTab(tab);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
