package com.rycb.etech.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModRecipes {

    static Random random = new Random();

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 0.8f);
        GameRegistry.addSmelting(ModBlocks.SULFUR_ORE, new ItemStack(ModItems.SULFUR, 1), 0.6f);
        GameRegistry.addSmelting(ModItems.CHOCOLATE_PROEMBRYO, new ItemStack(ModItems.CHOCOLATE, random.nextInt(3) + 1), 0.7f);
        GameRegistry.addSmelting(ModItems.RAW_PLASTIC, new ItemStack(ModItems.PLASTIC, 1), 0.9f);
    }

}
