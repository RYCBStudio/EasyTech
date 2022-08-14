package com.rycb.etech.blocks.container;

import com.rycb.etech.blocks.tileentity.BlastFurnaceRecipes;
import com.rycb.etech.blocks.tileentity.TileEntityBlastFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/11 16:13</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.blocks.container/ContainerBlastFurnace.java</p>
 * <h1><center>ContainerBlastFurnace</center></h1>
 */
public class ContainerBlastFurnace extends Container {
    private final TileEntityBlastFurnace tileentity;
    
    private int cookTime, totalCookTime, burnTime, currentBurnTime;
    
    public ContainerBlastFurnace(InventoryPlayer player, TileEntityBlastFurnace tileentity) {
        this.tileentity = tileentity;
        IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        this.addSlotToContainer(new SlotItemHandler(handler, 0, 23, 16));
        this.addSlotToContainer(new SlotItemHandler(handler, 1, 54, 16));
        this.addSlotToContainer(new SlotItemHandler(handler, 2, 98, 45));
        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                this.addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }
        
        for (int x = 0; x < 9; x++) {
            this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
        }
    }
    
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        
        for (IContainerListener iContainerListener : this.listeners) {
            IContainerListener listener = (IContainerListener) iContainerListener;
            
            if (this.cookTime != this.tileentity.getField(2))
                listener.sendWindowProperty(this, 2, this.tileentity.getField(2));
            if (this.burnTime != this.tileentity.getField(0))
                listener.sendWindowProperty(this, 0, this.tileentity.getField(0));
            if (this.currentBurnTime != this.tileentity.getField(1))
                listener.sendWindowProperty(this, 1, this.tileentity.getField(1));
            if (this.totalCookTime != this.tileentity.getField(3))
                listener.sendWindowProperty(this, 3, this.tileentity.getField(3));
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data) {
        this.tileentity.setField(id, data);
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.tileentity.isUsableByPlayer(playerIn);
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = (Slot) this.inventorySlots.get(index);
        
        if (slot != null && slot.getHasStack()) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();
            
            if (index == 3) {
                if (!this.mergeItemStack(stack1, 4, 40, true)) return ItemStack.EMPTY;
                slot.onSlotChange(stack1, stack);
            } else if (index != 2 && index != 1 && index != 0) {
                Slot slot1 = (Slot) this.inventorySlots.get(index + 1);
                if (!BlastFurnaceRecipes.getInstance().getSinterResult(stack1, slot1.getStack()).isEmpty()) {
                    return ItemStack.EMPTY;
                } else if (TileEntityBlastFurnace.isItemFuel(stack1)) {
                    if (!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
                } else if (TileEntityBlastFurnace.isItemFuel(stack1)) {
                    if (!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
                } else if (TileEntityBlastFurnace.isItemFuel(stack1)) {
                    if (!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
                } else if (index >= 4 && index < 31) {
                    if (!this.mergeItemStack(stack1, 31, 40, false)) return ItemStack.EMPTY;
                } else if (index >= 31 && index < 40 && !this.mergeItemStack(stack1, 4, 31, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(stack1, 4, 40, false)) {
                return ItemStack.EMPTY;
            }
            if (stack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
                
            }
            if (stack1.getCount() == stack.getCount()) return ItemStack.EMPTY;
            slot.onTake(playerIn, stack1);
        }
        return stack;
    }
    
    
}
