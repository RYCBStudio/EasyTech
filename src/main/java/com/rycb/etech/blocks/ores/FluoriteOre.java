package com.rycb.etech.blocks.ores;

import com.rycb.etech.EasyTech;
import com.rycb.etech.blocks.base.BlockOreBase;
import com.rycb.etech.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/6 15:50</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.block.ores/FluoriteOre.java</p>
 * <h1><center>FluoriteOre</center></h1>
 */
public class FluoriteOre extends BlockOreBase {

    public FluoriteOre() {
        super("Fluorite", "fluorite", Material.ROCK, EasyTech.ETECH_TAB);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 2);
        setResistance(0.8f);
        setHardness(5.0f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.FLUORITE_GEM;
    }

    @Override
    public int quantityDropped(Random rand) {
        int min = 1;
        int max = 5;
        return rand.nextInt(max) + min;
    }
}
