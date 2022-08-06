package com.rycb.etech.init;

import com.rycb.etech.EasyTech;
import com.rycb.etech.armors.ArmorBase;
import com.rycb.etech.food.EffectFoodBase;
import com.rycb.etech.items.base.ItemBasicBase;
import com.rycb.etech.items.base.ItemFolkPrescription;
import com.rycb.etech.items.base.ItemIngotBase;
import com.rycb.etech.items.base.tools.*;
import com.rycb.etech.items.single.EnchantedGlisteningMelon;
import com.rycb.etech.items.single.EnchantedGoldenCarrot;
import com.rycb.etech.items.single.GlisteningMelon;
import com.rycb.etech.items.single.MCG;
import com.rycb.etech.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();


    /**
     * Items
     */
    public static final Item STEEL_INGOT = new ItemIngotBase("Steel", "steel", EasyTech.ETECH_TAB);

    public static final Item TIN_INGOT = new ItemIngotBase("Tin", "tin", EasyTech.ETECH_TAB);

    public static final Item COPPER_INGOT = new ItemIngotBase("Copper", "copper", EasyTech.ETECH_TAB);

    public static final Item LEAD_INGOT = new ItemIngotBase("Lead", "lead", EasyTech.ETECH_TAB);

    public static final Item SULFUR = new ItemBasicBase("sulfur", "sulfur", EasyTech.ETECH_TAB);

    public static final Item PLASTIC = new ItemBasicBase("plastic", "plastic", EasyTech.ETECH_TAB);

    public static final Item URANIUM_INGOT = new ItemIngotBase("Uranium", "uranium", EasyTech.ETECH_TAB);

    /**
     * Materials
     */
    public static final Item.ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 1200, 8.5f, 2.5f, 20);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 17, new int[]{3, 7, 10, 5}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.25f);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_RADIATION_PROTECTION = EnumHelper.addArmorMaterial("armor_material_radiation_protection", Reference.MOD_ID + ":radiation_protection", 30, new int[]{4, 8, 12, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
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

    public static final Item RADIATION_PROTECTION_HELMET = new ArmorBase(ARMOR_MATERIAL_RADIATION_PROTECTION, 1, EntityEquipmentSlot.HEAD, "helmetRP", "rp_helmet", EasyTech.ETECH_TAB);
    public static final Item RADIATION_PROTECTION_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_RADIATION_PROTECTION, 1, EntityEquipmentSlot.CHEST, "cplateRP", "rp_chestplate", EasyTech.ETECH_TAB);
    public static final Item RADIATION_PROTECTION_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_RADIATION_PROTECTION, 2, EntityEquipmentSlot.LEGS, "leggingsRP", "rp_leggings", EasyTech.ETECH_TAB);
    public static final Item RADIATION_PROTECTION_BOOTS = new ArmorBase(ARMOR_MATERIAL_RADIATION_PROTECTION, 1, EntityEquipmentSlot.FEET, "bootsRP", "rp_boots", EasyTech.ETECH_TAB);
    /**
     * Foods
     */

    public static final Item SULFUR_CHOCOLATE = new EffectFoodBase("SulfurChocolate", "sulfur_chocolate", 4, 1.4f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.POISON, 60 * 20, 2), new PotionEffect(MobEffects.WITHER, 60 * 20, 2), new PotionEffect(MobEffects.NAUSEA, 120 * 20, 3));
    public static final Item CHOCOLATE = new EffectFoodBase("chocolate", "chocolate", 10, 2.0f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.HASTE, 120 * 60, 3), new PotionEffect(MobEffects.GLOWING, 120 * 60, 2), new PotionEffect(MobEffects.REGENERATION, 120 * 60, 3));
    /*Folk Prescriptions*/
    public static final Item FOLK_PRESCRIPTION_1 = new ItemFolkPrescription(1, 5, 10.0f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.REGENERATION, 80 * 20, 1), new PotionEffect(MobEffects.HUNGER, 50 * 20, 2), new PotionEffect(MobEffects.SLOWNESS, 40 * 20, 1));
    public static final Item FOLK_PRESCRIPTION_2 = new ItemFolkPrescription(2, new Random().nextInt(10), 7.8f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.ABSORPTION, 80 * 20, 3), new PotionEffect(MobEffects.BLINDNESS, 25 * 20, 1), null);
    public static final Item FOLK_PRESCRIPTION_3 = new ItemFolkPrescription(3, new Random().nextInt(10), 2.1f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.RESISTANCE, 80 * 20, 2), new PotionEffect(MobEffects.WEAKNESS, 60 * 20, 2), new PotionEffect(MobEffects.LEVITATION, 20 * 20, 1));
    public static final Item FOLK_PRESCRIPTION_4 = new ItemFolkPrescription(4, new Random().nextInt(10), 1.14154f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.WATER_BREATHING, 80 * 20, 2), new PotionEffect(MobEffects.MINING_FATIGUE, 15 * 20, 3), null);
    public static final Item FOLK_PRESCRIPTION_5 = new ItemFolkPrescription(5, new Random().nextInt(10), 1.919810f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.HEALTH_BOOST, 80 * 20, 4), new PotionEffect(MobEffects.POISON, 10 * 20, 1), new PotionEffect(MobEffects.UNLUCK, 40 * 20, 2));
    public static final Item FOLK_PRESCRIPTION_6 = new ItemFolkPrescription(6, new Random().nextInt(10), 5.55f, false, EasyTech.ETECH_TAB, new PotionEffect(MobEffects.STRENGTH, 120 * 20, 2), new PotionEffect(MobEffects.NIGHT_VISION, 120 * 20, 2), new PotionEffect(MobEffects.REGENERATION, 120 * 20, 5));
    public static final Item ENCHANTED_GOLDEN_CARROT = new EnchantedGoldenCarrot();
    public static final Item GLISTENING_MELON = new GlisteningMelon();
    public static final Item ENCHANTED_GLISTENING_MELON = new EnchantedGlisteningMelon();

    /**
     * Partially Prepared Products
     */
    public static final Item CHOCOLATE_PROEMBRYO = new ItemBasicBase("ChocolateProembryo", "chocolate_proembryo", EasyTech.ETECH_TAB);
    public static final Item RAW_PLASTIC = new ItemBasicBase("rawPlastic", "raw_plastic", EasyTech.ETECH_TAB);
    protected static int damage = new Random().nextInt();
    protected static int harvestLevel = new Random().nextInt();
    protected static float efficiency = new Random().nextFloat();
    protected static int enchantability = new Random().nextInt();
    public static final Item.ToolMaterial MATERIAL_MCG = EnumHelper.addToolMaterial("material_mcg", Math.max(harvestLevel, 4), 1919810, Math.max(efficiency, 64.0f), Math.max(damage, 114514), Math.max(enchantability, 80));
    //In the game its name is "Modder Cheat Gun"
    public static final Item MCG = new MCG(MATERIAL_MCG);
}
