package com.rycb.etech.item;
/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/02 9:12
 * Location:EasyTech/com.rycb.etech.item/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */

import com.rycb.etech.tab.TabLoader;
import net.minecraft.item.Item;

public class ItemingotRedstoneSteel extends Item {
    public ItemingotRedstoneSteel() {
        super();
        this.setUnlocalizedName("ingotRedstoneSteel");
        this.setCreativeTab(TabLoader.tabETech);
    }
}
