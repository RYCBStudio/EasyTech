package com.rycb.etech.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/01 14:32
 * Location:EasyTech/com.rycb.etech.items/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class ItemLoader {
    public static Item ingotSteel = new ItemingotSteel();
    public static Item ingotRedstoneSteel = new ItemingotRedstoneSteel();
    public ItemLoader(FMLPreInitializationEvent event){
        register(ingotSteel,"steel_block.json");
        register(ingotRedstoneSteel,"red_steel");
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(ingotSteel);
        registerRender(ingotRedstoneSteel);
    }
    private static void register(Item item, String name)
    {
        item.setRegistryName(name);
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}