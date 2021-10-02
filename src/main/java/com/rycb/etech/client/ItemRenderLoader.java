package com.rycb.etech.client;

import com.rycb.etech.block.BlockLoader;
import com.rycb.etech.item.ItemLoader;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/01 16:27
 * Location:EasyTech/com.rycb.etech.client/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class ItemRenderLoader {

    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }

}