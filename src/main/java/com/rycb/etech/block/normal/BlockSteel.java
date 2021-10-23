package com.rycb.etech.block.normal;

import com.rycb.etech.tab.TabLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/02 11:44
 * Location:EasyTech/com.rycb.etech.block/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class BlockSteel extends Block {
    public BlockSteel(){
        super(Material.ANVIL);
        this.setUnlocalizedName("blockSteel");
        this.setHardness(5.5F);
        this.setHarvestLevel("pickaxe",3);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(TabLoader.tabETech);
    }


}