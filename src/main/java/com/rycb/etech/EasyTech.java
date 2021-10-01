package com.rycb.etech;

import com.rycb.etech.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = EasyTech.MODID, name = EasyTech.NAME, version = EasyTech.VERSION)
public class EasyTech
{
    public static final String MODID = "etech";
    public static final String NAME = "EasyTech";
    public static final String VERSION = "1.0";
    @Mod.Instance(EasyTech.MODID)
    public static EasyTech instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.Init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    @SidedProxy(clientSide = "com.rycb.etech.client.ClientProxy",
            serverSide = "com.rycb.etech.common.CommonProxy")
    public static CommonProxy proxy;
}
