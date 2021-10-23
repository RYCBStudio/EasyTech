package com.rycb.etech.block;

import com.rycb.etech.block.normal.BlockSteel;
import com.rycb.etech.block.ore.OreLead;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/02 11:52
 * Location:EasyTech/com.rycb.etech.block/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class BlockLoader {
    public static Block blockSteel = new BlockSteel();
    public static Block oreLead = new OreLead();

    public BlockLoader(FMLPreInitializationEvent event){
        register(blockSteel, "steel_block");
        register(oreLead,"lead_ore");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(blockSteel);
        registerRender(oreLead);
    }
    private static void register(Block block, String name){
        block.setRegistryName(name);
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block){
        ModelResourceLocation model  = new ModelResourceLocation(block.getRegistryName(),"invertory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),0,model);
    }
}