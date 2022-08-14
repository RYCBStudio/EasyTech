package com.rycb.etech.blocks.ores;

import com.rycb.etech.blocks.base.BlockBase;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.handlers.OreDictHandler;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <h1><center>Sulfur Ore</center></h1>
 */
public class SulfurOre extends BlockBase {
    public SulfurOre(String UnlocalizedName, String RegistryName, Material material, CreativeTabs tab) {
        super(UnlocalizedName, RegistryName, material, tab);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 2);
        setResistance(0.8f);
        setHardness(5.0f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.SULFUR;
    }

    @Override
    public int quantityDropped(Random rand) {
        int min = 1;
        int max = 3;
        return rand.nextInt(max) + min;
    }
}
