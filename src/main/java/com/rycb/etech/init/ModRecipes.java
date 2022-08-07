package com.rycb.etech.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModRecipes {

    protected static final Random random = new Random();

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.SULFUR_ORE, new ItemStack(ModItems.SULFUR, 1), 0.6f);
        GameRegistry.addSmelting(ModItems.CHOCOLATE_PROEMBRYO, new ItemStack(ModItems.CHOCOLATE, random.nextInt(3) + 1), 0.7f);
        GameRegistry.addSmelting(ModItems.RAW_PLASTIC, new ItemStack(ModItems.PLASTIC, 1), 0.9f);
        GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.FLUORITE_ORE, new ItemStack(ModItems.FLUORITE_GEM, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.ALUMINIUM_ORE, new ItemStack(ModItems.ALUMINIUM_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.RADIUM_ORE, new ItemStack(ModItems.RADIUM_INGOT, 1), .8f);
    }

}
