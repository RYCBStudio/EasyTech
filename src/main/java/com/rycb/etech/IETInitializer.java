package com.rycb.etech;

import com.rycb.etech.util.Reference;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/12 11:45</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech/IETInitializer.java</p>
 * <h1><center>IETInitializer</center></h1>
 */
public interface IETInitializer {
    default void preInit(FMLPreInitializationEvent event) {
    
    }
    
    default void init(FMLInitializationEvent event) {
        
        ETPackets.network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);
        int packetid = 0;
        /*
        ETPackets.network.registerMessage(PacketShootGun.Handler.class, PacketShootGun.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketShootGunTarget.Handler.class, PacketShootGunTarget.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(GunFiredMessage.Handler.class, GunFiredMessage.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(ReloadStartedMessage.Handler.class, ReloadStartedMessage.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketPlaySound.Handler.class, PacketPlaySound.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketSpawnParticle.Handler.class, PacketSpawnParticle.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketSpawnParticleOnEntity.Handler.class, PacketSpawnParticleOnEntity.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketSwapWeapon.Handler.class, PacketSwapWeapon.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketEntityDeathType.Handler.class, PacketEntityDeathType.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketOpenPlayerGUI.Handler.class, PacketOpenPlayerGUI.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketTGKeybindPress.Handler.class, PacketTGKeybindPress.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketTGExtendedPlayerSync.Handler.class, PacketTGExtendedPlayerSync.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketTGPlayerFieldSync.Handler.class, PacketTGPlayerFieldSync.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketRequestTGPlayerSync.Handler.class, PacketRequestTGPlayerSync.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketGuiButtonClick.Handler.class, PacketGuiButtonClick.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketUpdateTileEntTanks.Handler.class, PacketUpdateTileEntTanks.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketRequestTileEntitySync.Handler.class, PacketRequestTileEntitySync.class, packetid++, Side.SERVER);
        ETPackets.network.registerMessage(PacketMultiBlockFormInvalidBlockMessage.Handler.class, PacketMultiBlockFormInvalidBlockMessage.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketShowKeybindConfirmMessage.Handler.class, PacketShowKeybindConfirmMessage.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketDoorStateChange.Handler.class, PacketDoorStateChange.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketNotifyAmbientEffectHandler.class, PacketNotifyAmbientEffectChange.class, packetid++, Side.CLIENT);
        ETPackets.network.registerMessage(PacketGunImpactFX.Handler.class, PacketGunImpactFX.class, packetid++, Side.CLIENT);
        */
        
        /*
        network.registerMessage(PacketRequestTurretSync.Handler.class, PacketRequestTurretSync.class, packetid++, Side.SERVER);
        network.registerMessage(PacketTGMessage.Handler.class, PacketTGMessage.class, packetid++, Side.CLIENT);*/
        //network.registerMessage(MyMessage.Handler.class, MyMessage.class, 0, Side.SERVER);
        // network.registerMessage(SecondMessage.Handler.class, SecondMessage.class, 1, Side.CLIENT);
        // ...
    }
    
    default void postInit(FMLPostInitializationEvent event) {
    
    }
}
