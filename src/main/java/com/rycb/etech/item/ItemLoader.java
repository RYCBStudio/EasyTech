package com.rycb.etech.item;

import com.rycb.etech.item.ingots.ItemingotRedstoneSteel;
import com.rycb.etech.item.ingots.ItemingotSteel;
import com.rycb.etech.item.normal.MetaItems;
import com.rycb.etech.item.tools.ToolSteel;
import com.rycb.etech.tab.TabLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
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
    //Ingots
    public static Item ingotSteel = new ItemingotSteel();
    public static Item ingotRedstoneSteel = new ItemingotRedstoneSteel();
    //Tools
    public static ItemSword toolSteelSword = new ToolSteel.ToolSteelSword();
    public static ItemPickaxe toolSteelPickaxe = new ToolSteel.ToolSteelPickaxe();
    public static ItemAxe toolSteelAxe = new ToolSteel.ToolSteelAxe();
    public static ItemSpade toolSteelShovel = new ToolSteel.ToolSteelShovel();
    public static ItemHoe toolSteelHoe = new ToolSteel.ToolSteelHoe();
    //Others
    public static MetaItems DarkMatter = new MetaItems("matterDark");


    public ItemLoader(FMLPreInitializationEvent event){
        register(ingotSteel,"steel_ingot");
        register(ingotRedstoneSteel,"red_steel");
        register(toolSteelAxe,"steel_axe");

        register(toolSteelPickaxe,"steel_pickaxe");
        register(toolSteelSword,"steel_sword");
        register(toolSteelShovel,"steel_shovel");
        register(toolSteelHoe,"steel_hoe");

        register(DarkMatter,"dark_matter");


    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(ingotSteel);
        registerRender(ingotRedstoneSteel);

        registerRender(toolSteelHoe);
        registerRender(toolSteelAxe);
        registerRender(toolSteelPickaxe);
        registerRender(toolSteelSword);
        registerRender(toolSteelShovel);

        registerRender(DarkMatter);

    }
    private static void register(Item item, String name)
    {
        item.setRegistryName(name);
        item.setCreativeTab(TabLoader.tabETech);
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}