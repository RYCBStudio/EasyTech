package com.rycb.etech.items.base.tools;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * @author RYCBStudio/Java Department
 */
public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(material, 9.0f, -2.5f);
        setUnlocalizedName("axe" + UnlocalizedName);
        setRegistryName(RegistryName + "_axe");
        setCreativeTab(tab);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
