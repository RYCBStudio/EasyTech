package com.rycb.etech.tabs;

import com.rycb.etech.init.ItemsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/09/25 10:20
 * Location:EasyTech/com.rycb.etech.tabs/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class ETechTabs extends CreativeTabs {
    public ETechTabs() {

        super("etech");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsInit.ingotSteel);
    }

}