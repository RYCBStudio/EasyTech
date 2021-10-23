package com.rycb.etech.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/06 18:23
 * Location:EasyTech/com.rycb.etech.item.tools/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class ToolSteel
{
    public static final Item.ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 4, 64, 32.0F, 3.0F, 25);
    public static class ToolSteelSword extends ItemSword {
        public ToolSteelSword() {
            super(STEEL);
            setUnlocalizedName("swordSteel");
        }
    }
    public static class ToolSteelPickaxe extends ItemPickaxe {
        public ToolSteelPickaxe() {
            super(STEEL);
            setUnlocalizedName("pickaxeSteel");
        }
    }
    public static class ToolSteelAxe extends ItemAxe {
        public ToolSteelAxe() {
            super(STEEL, 10, 10);
            setUnlocalizedName("axeSteel");
                }
            }
    public static class ToolSteelShovel extends ItemSpade {
        public ToolSteelShovel() {
            super(STEEL);
            setUnlocalizedName("shovelSteel");
        }
    }
    public static class ToolSteelHoe extends ItemHoe {
        public ToolSteelHoe() {
            super(STEEL);
            setUnlocalizedName("hoeSteel");
        }
    }
}