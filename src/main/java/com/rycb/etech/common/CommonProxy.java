package com.rycb.etech.common;



import com.rycb.etech.block.BlockLoader;
import com.rycb.etech.item.ItemLoader;
import com.rycb.etech.tab.TabLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy
{
        public void preInit(FMLPreInitializationEvent event)
        {
                new ItemLoader(event);
                new TabLoader(event);
                new BlockLoader(event);
        }

        public void Init(FMLInitializationEvent event)
        {

        }

        public void postInit(FMLPostInitializationEvent event)
        {

        }
}