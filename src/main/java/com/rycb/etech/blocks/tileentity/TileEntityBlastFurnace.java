package com.rycb.etech.blocks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/11 16:54</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.blocks.tileentity/TileEntityBlastFurnace.java</p>
 * <h1><center>TileEntityBlastFurnace</center></h1>
 */
public class TileEntityBlastFurnace extends TileEntity implements ITickable {
    public ItemStackHandler handler = new ItemStackHandler(4);
    private String customName;
    private ItemStack smelting = ItemStack.EMPTY;
    private int burnTime;
    private int currentBurnTime;
    private int cookTime;
    private int totalCookTime = 200;
    
    @SideOnly(Side.CLIENT)
    public static boolean isBurning(TileEntityBlastFurnace tile) {
        return tile.getField(0) > 0;
    }
    
    //定义燃料燃烧的时间
    public static int getItemBurnTime(ItemStack fuel) {
        if (fuel.isEmpty()) return 0;
        else {
            Item item = fuel.getItem();

//            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
//            {
//                Block block = Block.getBlockFromItem(item);
//
//                if (block == Blocks.WOODEN_SLAB) return 150;
//                if (block.getDefaultState().getMaterial() == Material.WOOD) return 300;
//                if (block == Blocks.COAL_BLOCK) return 16000;
//            }
//
//            if (item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) return 200;
//            if (item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) return 200;
//            if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) return 200;
//            if (item == Items.STICK) return 100;
            //我们设置燃料可以为煤炭、岩浆，你可以添加其他的东西成为燃料
            if (item == Items.COAL) return 1600;
            if (item == Items.LAVA_BUCKET) return 20000;
//            if (item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
//            if (item == Items.BLAZE_ROD) return 2400;
            
            return GameRegistry.getFuelValue(fuel);
        }
    }
    
    public static boolean isItemFuel(ItemStack fuel) {
        return getItemBurnTime(fuel) > 0;
    }
    
    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
    }
    
    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) this.handler;
        return super.getCapability(capability, facing);
    }
    
    public boolean hasCustomName() {
        return this.customName != null && !this.customName.isEmpty();
    }
    
    public void setCustomName(String customName) {
        this.customName = customName;
    }
    
    @Override
    public ITextComponent getDisplayName() {
        return this.hasCustomName() ? new TextComponentString(this.customName) : new TextComponentTranslation("container.blast_furnace");
    }
    
    //因为我们一共有四个参数(burnTime、cookTime、totalCookTime、currentBurnTime)，都要加入NBT标签
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentBurnTime = getItemBurnTime((ItemStack) this.handler.getStackInSlot(2));
        
        if (compound.hasKey("CustomName", 8)) this.setCustomName(compound.getString("CustomName"));
    }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", (short) this.burnTime);
        compound.setInteger("CookTime", (short) this.cookTime);
        compound.setInteger("CookTimeTotal", (short) this.totalCookTime);
        compound.setTag("Inventory", this.handler.serializeNBT());
        
        if (this.hasCustomName()) compound.setString("CustomName", this.customName);
        return compound;
    }
    
    public boolean isBurning() {
        return this.burnTime > 0;
    }
    
    //对机器燃烧的状态进行实时更新
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;
        
        if (this.isBurning()) {
            --this.burnTime;
        }
        
        if (!this.world.isRemote) {
            ItemStack[] itemstack = new ItemStack[]{handler.getStackInSlot(0), handler.getStackInSlot(1)};
            ItemStack fuel = this.handler.getStackInSlot(2);
            
            if (this.isBurning() || !fuel.isEmpty() && !this.handler.getStackInSlot(0).isEmpty() || this.handler.getStackInSlot(1).isEmpty()) {
                if (!this.isBurning() && this.canSmelt()) {
                    this.burnTime = getItemBurnTime(fuel);
                    this.currentBurnTime = this.burnTime;
                    
                    if (this.isBurning()) {
                        flag1 = true;
                        
                        if (!fuel.isEmpty()) {
                            Item item = fuel.getItem();
                            fuel.shrink(1);
                            
                            if (fuel.isEmpty()) {
                                ItemStack item1 = item.getContainerItem(fuel);
                                this.handler.setStackInSlot(2, item1);
                            }
                        }
                    }
                }
                
                if (this.isBurning() && this.canSmelt()) {
                    ++this.cookTime;
                    
                    if (this.cookTime == this.totalCookTime) {
                        //熔炼时间达到了熔炼要求时间，就在3号槽产出一个产物
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.handler.getStackInSlot(2));
                        this.smeltItem();
                        flag1 = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            } else if (!this.isBurning() && this.cookTime > 0) {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }
            
            if (flag != this.isBurning()) {
                flag1 = true;
                BlockBlastFurnace.setState(this.isBurning(), this.world, this.pos);
            }
        }
        
        if (flag1) {
            this.markDirty();
        }
    }
    
    private boolean canSmelt() {
        
        if (((ItemStack) this.handler.getStackInSlot(0)).isEmpty() || ((ItemStack) this.handler.getStackInSlot(1)).isEmpty()) {
            return false;
        } else {
            ItemStack result = BlastFurnaceRecipes.getInstance().getSinteringResult((ItemStack) this.handler.getStackInSlot(0), (ItemStack) this.handler.getStackInSlot(1));
            
            if (result.isEmpty()) {
                return false;
            } else {
                ItemStack output = (ItemStack) this.handler.getStackInSlot(3);
                
                if (output.isEmpty()) {
                    return true;
                } else if (!output.isItemEqual(result)) {
                    return false;
                } else if (output.getCount() + result.getCount() <= 64 && output.getCount() + result.getCount() <= output.getMaxStackSize())  // Forge fix: make furnace respect stack sizes in furnace recipes
                {
                    return true;
                } else {
                    return output.getCount() + result.getCount() <= output.getMaxStackSize(); // Forge fix: make furnace respect stack sizes in furnace recipes
                }
            }
        }
    }
    
    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack[] itemstack = new ItemStack[]{handler.getStackInSlot(0), handler.getStackInSlot(1)};
            ItemStack itemstack1 = BlastFurnaceRecipes.getInstance().getSinteringResult((ItemStack) this.handler.getStackInSlot(0), (ItemStack) this.handler.getStackInSlot(1));
            ItemStack itemstack2 = this.handler.getStackInSlot(3);
            
            if (itemstack2.isEmpty()) {
                this.handler.setStackInSlot(3, itemstack1.copy());
            } else if (itemstack2.getItem() == itemstack1.getItem()) {
                itemstack2.grow(itemstack1.getCount());
            }
            itemstack[0].shrink(1);
            itemstack[1].shrink(1);
        }
    }
    
    public boolean isUsableByPlayer(EntityPlayer player) {
        return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }
    
    public int getField(int id) {
        switch (id) {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }
    
    public void setField(int id, int value) {
        switch (id) {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }
    
    public int getCookTime(ItemStack stack) {
        return 200;
    }
    
}
