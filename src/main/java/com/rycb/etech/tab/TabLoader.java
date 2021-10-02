package com.rycb.etech.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/10/02 12:25
 * Location:EasyTech/com.rycb.etech.tab/
 * This is the project of EasyTech
 * Use the IntelliJ IDEA
 */
public class TabLoader {

    public static CreativeTabs tabETech;
    public TabLoader(FMLPreInitializationEvent event){
        tabETech = new ETechTab();
    }

}