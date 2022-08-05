package com.rycb.etech.util.handlers;

import com.rycb.etech.entity.EntityWitherKing;
import com.rycb.etech.entity.render.RenderWitherKing;
import com.rycb.etech.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/3 16:37</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.util.handlers/RenderHandler.java</p>
 * <h1><center>RenderHandler</center></h1>
 */

public class RenderHandler {
    public static void registerCustomMeshesAndStates() {
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.OIL_BLOCK), stack -> {
            //这里是你的modid:流体名称
            return new ModelResourceLocation("etech:oil", "fluid");
        });

        ModelLoader.setCustomStateMapper(ModBlocks.OIL_BLOCK, new StateMapperBase() {
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                //这里是你的modid:流体名称
                return new ModelResourceLocation("etech:oil", "fluid");
            }
        });
    }

    public static void registerEntityRenders() {

        RenderingRegistry.registerEntityRenderingHandler(EntityWitherKing.class, RenderWitherKing::new);
    }
}
