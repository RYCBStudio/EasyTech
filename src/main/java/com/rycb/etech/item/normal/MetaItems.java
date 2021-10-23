package com.rycb.etech.item.normal;

import net.minecraft.item.Item;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/19 16:52
 * Location:EasyTech/com.rycb.etech.item.normal/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class MetaItems extends Item {
    public String UnName;

    public MetaItems(String UnlocalizedName) {
        super();
        UnName = UnlocalizedName;
        setUnlocalizedName(UnlocalizedName);
        setMaxStackSize(64);

    }
}