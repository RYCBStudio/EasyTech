package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.block.base.BlockOreBase;
import com.rycb.etech.block.fluids.FluidBlock;
import com.rycb.etech.block.ores.FluoriteOre;
import com.rycb.etech.block.ores.SulfurOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    /**
     * Ores
     */
    public static final Block COPPER_ORE = new BlockOreBase("Copper", "copper", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block TIN_ORE = new BlockOreBase("Tin", "tin", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block LEAD_ORE = new BlockOreBase("Lead", "lead", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block SULFUR_ORE = new SulfurOre("oreSulfur", "sulfur_ore", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block URANIUM_ORE = new BlockOreBase("Uranium", "uranium", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block FLUORITE_ORE = new FluoriteOre();

    public static final Block ALUMINIUM_ORE = new BlockOreBase("Aluminium", "aluminium", Material.ROCK, EasyTech.ETECH_TAB);

    public static final Block RADIUM_ORE = new BlockOreBase("Radium", "radium", Material.ROCK, EasyTech.ETECH_TAB);
    
    /**
     * Fluid Blocks
     */
    public static final Block OIL_BLOCK = new FluidBlock("oil", ModFluids.OIL, Material.WATER);

}
