package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.armors.ArmorBase;
import com.rycb.etech.items.base.ItemBasicBase;
import com.rycb.etech.items.base.ItemIngotBase;
import com.rycb.etech.items.base.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;

import net.minecraft.util.SoundEvent;
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

    public static final Item SULFUR = new ItemBasicBase("sulfur", "sulfur", EasyTech.ETECH_TAB);

    /**
     * Materials
     */
    public static final Item.ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 1200, 8.5f, 2.5f, 20);

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", EasyTech.MODID + ":steel", 17, new int[]{5, 10, 7, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.25f);
    /**
     * Tools
     */
//    public static final ItemSword STEEL_SWORD = new ToolSword(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemHoe STEEL_HOE = new ToolHoe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemAxe STEEL_AXE = new ToolAxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
//    public static final ItemSpade STEEL_SHOVEL = new ToolShovel(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);

    /**
     * Armors
     */
    public static Item STEEL_HELMET = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD, "helmetSteel", "steel_helmet", EasyTech.ETECH_TAB);
    public static Item STEEL_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST, "cplateSteel", "steel_chestplate", EasyTech.ETECH_TAB);
    public static Item STEEL_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS, "leggingsSteel", "steel_leggings", EasyTech.ETECH_TAB);
    public static Item STEEL_BOOTS = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET, "bootsSteel", "steel_boots", EasyTech.ETECH_TAB);

}
