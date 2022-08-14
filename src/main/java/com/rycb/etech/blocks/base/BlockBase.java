package com.rycb.etech.blocks.base;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModBlocks;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String UnlocalizedName, String RegistryName, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
