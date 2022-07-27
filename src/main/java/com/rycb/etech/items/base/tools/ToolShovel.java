package com.rycb.etech.items.base.tools;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {
    public ToolShovel(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("shovel"+UnlocalizedName);
        setRegistryName(RegistryName+"_shovel");
        setCreativeTab(tab);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
