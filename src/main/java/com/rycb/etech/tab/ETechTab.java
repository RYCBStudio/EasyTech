package com.rycb.etech.tab;

import com.rycb.etech.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/02 12:20
 * Location:EasyTech/com.rycb.etech.tab/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class ETechTab extends CreativeTabs {
    public ETechTab(){
        super("etech_tab");
    }
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.ingotSteel);
    }

}