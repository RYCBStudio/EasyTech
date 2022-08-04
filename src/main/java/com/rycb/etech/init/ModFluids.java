package com.rycb.etech.init;

import com.rycb.etech.fluid.FluidLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/3 16:25</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.init/ModFluids.java</p>
 * <h1><center>ModFluids</center></h1>
 */
public class ModFluids {

    public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();

    public static final Fluid OIL = new FluidLiquid("oil", new ResourceLocation("etech:blocks/oil_still"), new ResourceLocation("etech:blocks/oil_flow"));

    public static void registerFluids() {
        for (Fluid fluid : FLUIDS) {
            registerFluid(fluid);
        }
    }

    public static void registerFluid(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
