package com.rycb.etech.init;


import com.rycb.etech.fluids.FluidLiquid;
import com.rycb.etech.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/7 19:24</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.init/ModFluids.java</p>
 * <h1><center>ModFluids</center></h1>
 */
public class ModFluids {
    public static final Fluid OIL = new FluidLiquid("oil", new ResourceLocation(Reference.MOD_ID + ":blocks/oil_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/oil_flow"));
    
    public static void registerFluids() {
        registerFluid(OIL);
    }
    
    public static void registerFluid(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
