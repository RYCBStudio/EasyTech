package com.rycb.etech.block.fluids;

import com.rycb.etech.init.ModBlocks;
import com.rycb.etech.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/7 19:45</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.block.fluids/FluidBlock.java</p>
 * <h1><center>FluidBlock</center></h1>
 */
public class FluidBlock extends BlockFluidClassic {
    public FluidBlock(String name, Fluid fluid, Material material) {
        super(fluid, material);
        setUnlocalizedName(name);
        setRegistryName(name);
        
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
