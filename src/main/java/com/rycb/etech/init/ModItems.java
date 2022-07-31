package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.armors.ArmorBase;
import com.rycb.etech.food.EffectFoodBase;
import com.rycb.etech.items.base.ItemBasicBase;
import com.rycb.etech.items.base.ItemIngotBase;
import com.rycb.etech.items.base.singleitem.ItemFolkPrescription1;
import com.rycb.etech.items.base.tools.*;
import com.rycb.etech.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
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

    //In the game its name is "Modder Cheat Gun"
    public static final Item MCG = new ItemBasicBase("icon", "icon_item", EasyTech.ETECH_TAB);

    public static final Item SULFUR = new ItemBasicBase("sulfur", "sulfur", EasyTech.ETECH_TAB);

    public static final Item PLASTIC = new ItemBasicBase("plastic", "plastic", EasyTech.ETECH_TAB);


    /**
     * Materials
     */
    public static final Item.ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 1200, 8.5f, 2.5f, 20);

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 17, new int[]{5, 10, 7, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.25f);


    /**
     * Tools
     */
    public static final ItemSword STEEL_SWORD = new ToolSword(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
    public static final ItemHoe STEEL_HOE = new ToolHoe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
    public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
    public static final ItemAxe STEEL_AXE = new ToolAxe(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);
    public static final ItemSpade STEEL_SHOVEL = new ToolShovel(MATERIAL_STEEL, "Steel", "steel", EasyTech.ETECH_TAB);


    /**
     * Armors
     */
    public static final Item STEEL_HELMET = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD, "helmetSteel", "steel_helmet", EasyTech.ETECH_TAB);
    public static final Item STEEL_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST, "cplateSteel", "steel_chestplate", EasyTech.ETECH_TAB);
    public static final Item STEEL_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS, "leggingsSteel", "steel_leggings", EasyTech.ETECH_TAB);
    public static final Item STEEL_BOOTS = new ArmorBase(ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET, "bootsSteel", "steel_boots", EasyTech.ETECH_TAB);
    /**
     * Foods
     */

    public static final Item SULFUR_CHOCOLATE = new EffectFoodBase("SulfurChocolate", "sulfur_chocolate", 4, 1.4f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.POISON, 60 * 20, 2), new PotionEffect(MobEffects.WITHER, 60 * 20, 2), new PotionEffect(MobEffects.NAUSEA, 120 * 20, 3));
    public static final Item CHOCOLATE = new EffectFoodBase("chocolate", "chocolate", 10, 2.0f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.HASTE, 120 * 60, 3), new PotionEffect(MobEffects.GLOWING, 120 * 60, 2), new PotionEffect(MobEffects.REGENERATION, 120 * 60, 3));

    public static final Item FOLK_PRESCRIPTION_1 = new ItemFolkPrescription1("folkPsn1", "folk_psn_1", 5, 10.0f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.REGENERATION, 80 * 20, 1), new PotionEffect(MobEffects.HUNGER, 50 * 20, 2), new PotionEffect(MobEffects.SLOWNESS, 40 * 20, 1));

    /**
     * Partially Prepared Products
     */
    public static final Item CHOCOLATE_PROEMBRYO = new ItemBasicBase("ChocolateProembryo", "chocolate_proembryo", EasyTech.ETECH_TAB);

    public static final Item RAW_PLASTIC = new ItemBasicBase("rawPlastic", "raw_plastic", EasyTech.ETECH_TAB);
}
