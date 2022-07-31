//package com.rycb.etech.block;
//
//import com.rycb.etech.EasyTech;
//import com.rycb.etech.block.base.BlockBase;
//import com.rycb.etech.init.ModBlocks;
//import net.minecraft.block.BlockHorizontal;
//import net.minecraft.block.SoundType;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.properties.PropertyBool;
//import net.minecraft.block.properties.PropertyDirection;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//
//import java.util.Random;
//
///**
// * @author RYCBStudio/Java Department
// * <p>Create Time: 2022/7/30 20:26</p>
// * <p>Use the IntelliJ IDEA</p>
// * <p>Location: EasyTech/com.rycb.etech.block/BlockMaterialPresser.java</p>
// * <h1><center>BlockMaterialPresser</center></h1>
// */
//public class BlockMaterialPresser extends BlockBase {
//
//    public static final PropertyDirection FACING = BlockHorizontal.FACING;
//    public static final PropertyBool BURNING = PropertyBool.create("burning");
//    private static boolean keepInventory;
//
//    public BlockMaterialPresser(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
//        super(UnlocalizedName, RegistryName, Material.IRON, tab);
//        setSoundType(SoundType.METAL);
//        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(BURNING, false));
//    }
//
//    @Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//        return Item.getItemFromBlock(ModBlocks.MATERIAL_PRESS);
//    }
//
//    @Override
//    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
//        return new ItemStack(ModBlocks.MATERIAL_PRESS);
//    }
//
//    @Override
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
//        if (!worldIn.isRemote) {
//            playerIn.openGui(EasyTech.instance, ModGuiElementLoader.GUI_MLP, worldIn, pos.getX(), pos.getY(), pos.getZ());
//        }
//
//        return true;
//    }
//
//    @Override
//    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
//        if (!worldIn.isRemote) {
//            IBlockState north = worldIn.getBlockState(pos.north());
//            IBlockState south = worldIn.getBlockState(pos.south());
//            IBlockState west = worldIn.getBlockState(pos.west());
//            IBlockState east = worldIn.getBlockState(pos.east());
//            EnumFacing face = (EnumFacing) state.getValue(FACING);
//
//            if (face == EnumFacing.NORTH && north.isFullBlock());
//        }
//    }
//}
