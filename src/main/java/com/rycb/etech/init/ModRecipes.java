package com.rycb.etech.init;

import com.rycb.etech.util.SimpleCalculator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModRecipes {

    protected static final Random random = new Random();

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.SULFUR_ORE, new ItemStack(ModItems.SULFUR, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModItems.CHOCOLATE_PROEMBRYO, new ItemStack(ModItems.CHOCOLATE, random.nextInt(3) + 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModItems.RAW_PLASTIC, new ItemStack(ModItems.PLASTIC, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.FLUORITE_ORE, new ItemStack(ModItems.FLUORITE_GEM, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.ALUMINIUM_ORE, new ItemStack(ModItems.ALUMINIUM_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.RADIUM_ORE, new ItemStack(ModItems.RADIUM_INGOT, 1), SimpleCalculator.getSimpleBurnXp());
    }

}
