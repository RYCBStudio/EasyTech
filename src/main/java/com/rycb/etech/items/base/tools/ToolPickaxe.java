package com.rycb.etech.items.base.tools;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
    public ToolPickaxe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("pickaxe" + UnlocalizedName);
        setRegistryName(RegistryName + "_pickaxe");
        setCreativeTab(tab);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
