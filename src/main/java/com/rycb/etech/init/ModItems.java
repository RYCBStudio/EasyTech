package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.items.base.ItemBasicBase;
import com.rycb.etech.items.base.ItemIngotBase;
import com.rycb.etech.items.base.tools.*;
import net.minecraft.item.*;

import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    /**
     * Items
     */
    public static final Item STEEL_INGOT = new ItemIngotBase("Steel", "steel", EasyTech.ETECH_TAB);

    public static final Item TIN_INGOT = new ItemIngotBase("Tin", "tin", EasyTech.ETECH_TAB);

    public static final Item COPPER_INGOT = new ItemIngotBase("Copper", "copper", EasyTech.ETECH_TAB);

    public static final Item LEAD_INGOT = new ItemIngotBase("Lead", "lead", EasyTech.ETECH_TAB);

    public static final Item ICON_ITEM = new ItemBasicBase("icon", "icon_item", EasyTech.ETECH_TAB);

    /**
     * Materials
     */
    public static final Item.ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 1200, 8.5f, 2.5f, 20);

    /**
     * Tools
     */
//    public static final ItemSword STEEL_SWORD = new ToolSword(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemHoe STEEL_HOE = new ToolHoe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemAxe STEEL_AXE = new ToolAxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemSpade STEEL_SHOVEL = new ToolShovel(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);

}
