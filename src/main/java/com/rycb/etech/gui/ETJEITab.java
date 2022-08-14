package com.rycb.etech.gui;

import com.rycb.etech.init.ModItems;
import micdoodle8.mods.galacticraft.api.client.tabs.AbstractTab;
import net.minecraft.item.ItemStack;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/12 11:40</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.gui/ETJEITab.java</p>
 * <h1><center>ETJEITab</center></h1>
 */
public class ETJEITab extends AbstractTab {
    public ETJEITab() {
        super(0, 0, 0, new ItemStack(ModItems.STEEL_INGOT));
    }
    
    @Override
    public void onTabClicked() {
    
    }
    
    @Override
    public boolean shouldAddToList() {
        return false;
    }
}
