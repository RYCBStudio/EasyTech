package com.rycb.etech.items.base.tools;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    public ToolSword(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("sword"+UnlocalizedName);
        setRegistryName(RegistryName+"_sword");
        setCreativeTab(tab);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
