package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.block.base.BlockBase;
import com.rycb.etech.block.base.BlockIngotBlockBase;
import com.rycb.etech.block.base.BlockOreBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    /**
     * Ores
     */
    public static final Block COPPER_ORE = new BlockOreBase("Copper", "copper", Material.IRON, EasyTech.ETECH_TAB);

    public static final Block TIN_ORE = new BlockOreBase("Tin", "tin", Material.IRON, EasyTech.ETECH_TAB);

    public static final Block LEAD_ORE = new BlockOreBase("Lead", "lead", Material.IRON, EasyTech.ETECH_TAB);

    //public static final Block SULFUR_ORE = new


    /**
     * Ingot Blocks
     */
//    public static final Block COPPER_BLOCK = new BlockIngotBlockBase("Copper", "copper", Material.IRON, EasyTech.ETECH_TAB);
}
