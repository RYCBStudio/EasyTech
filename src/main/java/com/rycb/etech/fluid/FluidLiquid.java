package com.rycb.etech.fluid;

import com.rycb.etech.init.ModFluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/3 16:23</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.fluid/FluidLiquid.java</p>
 * <h1><center>FluidLiquid</center></h1>
 */
public class FluidLiquid extends Fluid {
    public FluidLiquid(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing);
        this.setUnlocalizedName(fluidName);
        ModFluid.FLUIDS.add(this);
    }
}
