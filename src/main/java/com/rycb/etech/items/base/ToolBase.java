package com.rycb.etech.items.base;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class ToolBase {

    public static class Sword extends ItemSword implements IHasModel {
        public Sword(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
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

    public static class Hoe extends ItemHoe implements IHasModel {
        public Hoe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
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

    public static class Pickaxe extends ItemPickaxe implements IHasModel {
        public Pickaxe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
            super(material);
            setUnlocalizedName("pickaxe"+UnlocalizedName);
            setRegistryName(RegistryName+"_pickaxe");
            setCreativeTab(tab);
        }

        @Override
        public void registerModels() {
            EasyTech.proxy.registerItemRender(this, 0, "inventory");
        }
    }

    public static class Axe extends ItemAxe implements IHasModel {
        public Axe(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
            super(material);
            setUnlocalizedName("axe"+UnlocalizedName);
            setRegistryName(RegistryName+"_axe");
            setCreativeTab(tab);
        }

        @Override
        public void registerModels() {
            EasyTech.proxy.registerItemRender(this, 0, "inventory");
        }
    }

    public static class Shovel extends ItemSpade implements IHasModel {
        public Shovel(ToolMaterial material, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
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

}
