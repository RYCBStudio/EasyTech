package com.rycb.etech.util.handlers;

import com.rycb.etech.entity.EntityWitherKing;
import com.rycb.etech.entity.render.RenderWitherKing;
import com.rycb.etech.init.ModBlocks;
import com.rycb.etech.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.OIL_BLOCK), new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return new ModelResourceLocation(Reference.MOD_ID + "oil", "fluid");
            }
        });
        
        ModelLoader.setCustomStateMapper(ModBlocks.OIL_BLOCK, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return new ModelResourceLocation(Reference.MOD_ID + "oil", "fluid");
            }
        });
    }

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityWitherKing.class, RenderWitherKing::new);
    }
}
