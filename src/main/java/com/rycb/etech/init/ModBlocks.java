package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.blocks.base.BlockBase;
import com.rycb.etech.blocks.base.BlockOreBase;
import com.rycb.etech.blocks.fluids.FluidBlock;
import com.rycb.etech.blocks.ores.FluoriteOre;
import com.rycb.etech.blocks.ores.SulfurOre;
import com.rycb.etech.blocks.tileentity.BlockBlastFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    
    public static final List<Block> BLOCKS = new ArrayList<>();
    
    public static final Block NETHER_STAR_BLOCK = new BlockBase("ns_block", "nether_star_block", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block JUNIOR_NETHER_STAR_BLOCK = new BlockBase("j_ns_block", "ns_block_j", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block ELEMENTARY_NETHER_STAR_BLOCK = new BlockBase("e_ns_block", "ns_block_e", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block INTERMEDIATE_NETHER_STAR_BLOCK = new BlockBase("i_ns_block", "ns_block_i", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block SENIOR_NETHER_STAR_BLOCK = new BlockBase("s_ns_block", "ns_block_s", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block ULTIMATE_NETHER_STAR_BLOCK = new BlockBase("u_ns_block", "ns_block_u", Material.IRON, EasyTech.ETECH_TAB);
    
    public static final Block INSANIUM_NETHER_STAR_BLOCK = new BlockBase("n_ns_block", "ns_block_n", Material.IRON, EasyTech.ETECH_TAB);
    
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
    
    /**
     * Machines
     */
    public static final Block BLAST_FURNACE = new BlockBlastFurnace("blast_furnace");
}
