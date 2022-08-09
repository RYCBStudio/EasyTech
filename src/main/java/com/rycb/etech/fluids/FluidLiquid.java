package com.rycb.etech.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/7 19:22</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.fluids/FluidLiquid.java</p>
 * <h1><center>FluidLiquid</center></h1>
 */
public class FluidLiquid extends Fluid {
    public FluidLiquid(String name, ResourceLocation still, ResourceLocation flow) {
        super(name, still, flow);
        this.setUnlocalizedName(name);
    }
}
