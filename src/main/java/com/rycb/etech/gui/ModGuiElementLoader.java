package com.rycb.etech.gui;

import com.rycb.etech.EasyTech;
import com.rycb.etech.blocks.container.ContainerBlastFurnace;
import com.rycb.etech.blocks.tileentity.GuiBlastFurnace;
import com.rycb.etech.blocks.tileentity.TileEntityBlastFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/11 17:14</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.gui/ModGuiElementLoader.java</p>
 * <h1><center>ModGuiElementLoader</center></h1>
 */
public class ModGuiElementLoader implements IGuiHandler {
    public static final int GUI_BLAST_FURNACE = 1;
    public static final int GUI_DEMO = 2;
    public static final int GUI_RESEARCH = 3;
    
    public ModGuiElementLoader() {
        NetworkRegistry.INSTANCE.registerGuiHandler(EasyTech.instance, this);
    }
    
    //sitch语句选择显示服务端的Container界面
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GUI_BLAST_FURNACE:
                return new ContainerBlastFurnace(player.inventory, (TileEntityBlastFurnace) world.getTileEntity(new BlockPos(x, y, z)));
            
            default:
                return null;
        }
    }
    
    //sitch语句选择显示客户端的Gui界面
    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GUI_BLAST_FURNACE:
                return new GuiBlastFurnace(player.inventory, (TileEntityBlastFurnace) world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }
}
