package com.rycb.etech;

import com.rycb.etech.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Class for dealing with packets
 */
public class ETPackets implements IETInitializer {
    public static SimpleNetworkWrapper network;
    
    public static EntityPlayer getPlayerFromContext(MessageContext ctx) {
        EntityPlayer thePlayer = (ctx.side.isClient() ? EasyTech.proxy.getPlayerClient() : ctx.getServerHandler().player);
        return thePlayer;
    }
    
    public static TargetPoint targetPointAroundBlockPos(int dimension, BlockPos pos, double distance) {
        return new TargetPoint(dimension, pos.getX() + 0.5d, pos.getY() + 0.5d, pos.getZ() + 0.5d, distance);
    }
    
    public static TargetPoint targetPointAroundEnt(Entity ent, double distance) {
        return new TargetPoint(ent.dimension, ent.posX, ent.posY, ent.posZ, distance);
    }
    
    public static TargetPoint targetPointAroundEnt(TileEntity ent, double distance) {
        return new TargetPoint(ent.getWorld().provider.getDimension(), ent.getPos().getX(), ent.getPos().getY(), ent.getPos().getZ(), distance);
    }
    
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);
        int packetid = 0;
        
        //network.registerMessage();
    }
}