package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.block.base.BlockOreBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COPPER_ORE = new BlockOreBase("Copper", "copper", Material.IRON, EasyTech.ETECH_TAB);

    public static final Block TIN_ORE = new BlockOreBase("Tin", "tin", Material.IRON, EasyTech.ETECH_TAB);

    public static final Block LEAD_ORE = new BlockOreBase("Lead", "lead", Material.IRON, EasyTech.ETECH_TAB);
}
