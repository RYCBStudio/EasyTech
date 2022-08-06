package com.rycb.etech.world;

import com.rycb.etech.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * Create Time: 2022/7/27 19:55
 * Use the IntelliJ IDEA
 * Location: EasyTech/com.rycb.etech.world/ModWorldGen.java
 * <h1><center>ModWorldGen</center></h1>
 */
public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.SULFUR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 32, 4, 72, random.nextInt(6) + 1, 5);
        generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 6, chunkZ * 16, 2, 59, random.nextInt(3) + 1, 3);
        generateOre(ModBlocks.LEAD_ORE.getDefaultState(), world, random, chunkX * 8, chunkZ * 16, 1, 63, random.nextInt(3) + 1, 4);
        generateOre(ModBlocks.TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 39, random.nextInt(3) + 1, 4);
        generateOre(ModBlocks.URANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 62, random.nextInt(4) + 1, 5);
        generateOre(ModBlocks.FLUORITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 69, random.nextInt(5) + 1, 6);
    }


    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size);
        }
    }

}
