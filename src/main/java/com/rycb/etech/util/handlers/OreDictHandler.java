package com.rycb.etech.util.handlers;

import com.rycb.etech.init.ModBlocks;
import com.rycb.etech.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/10 17:25</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.util.handlers/OreDictHandler.java</p>
 * <h1><center>OreDictHandler</center></h1>
 */
public class OreDictHandler {
    public static void init() {
        OreDictionary.registerOre("oreRadium", ModBlocks.RADIUM_ORE);
        OreDictionary.registerOre("oreTin", ModBlocks.TIN_ORE);
        OreDictionary.registerOre("oreCopper", ModBlocks.COPPER_ORE);
        OreDictionary.registerOre("oreLead", ModBlocks.LEAD_ORE);
        OreDictionary.registerOre("oreSulfur", ModBlocks.SULFUR_ORE);
        OreDictionary.registerOre("oreUranium", ModBlocks.URANIUM_ORE);
        OreDictionary.registerOre("oreAluminum", ModBlocks.ALUMINIUM_ORE);
        OreDictionary.registerOre("oreFluorite", ModBlocks.FLUORITE_ORE);
        OreDictionary.registerOre("ingotAluminium", ModItems.ALUMINIUM_INGOT);
        OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
        OreDictionary.registerOre("forge:gems/fluorite", ModItems.FLUORITE_GEM);
        OreDictionary.registerOre("ingotLead", ModItems.LEAD_INGOT);
        OreDictionary.registerOre("platePlastic", ModItems.PLASTIC);
        OreDictionary.registerOre("ingotRadium", ModItems.RADIUM_INGOT);
        OreDictionary.registerOre("dustSulfur", ModItems.SULFUR);
        OreDictionary.registerOre("ingotTin", ModItems.TIN_INGOT);
        OreDictionary.registerOre("ingotUranium", ModItems.URANIUM_INGOT);
        OreDictionary.registerOre("ingotSteel", ModItems.STEEL_INGOT);
        OreDictionary.registerOre("netherStar", Items.NETHER_STAR);
        OreDictionary.registerOre("blockNetherStar", ModBlocks.NETHER_STAR_BLOCK);
        OreDictionary.registerOre("blockDiamond", Blocks.DIAMOND_BLOCK);
    }
}
