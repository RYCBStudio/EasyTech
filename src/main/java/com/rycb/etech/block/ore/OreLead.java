package com.rycb.etech.block.ore;
/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/06 18:08
 * Location:EasyTech/com.rycb.etech.block/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */

import com.rycb.etech.tab.TabLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreLead extends Block {
    public OreLead() {
        super(Material.ROCK);
        setUnlocalizedName("OreLead");
        setHardness(2.0F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 2);
        setResistance(10);
        setCreativeTab(TabLoader.tabETech);
    }
}
