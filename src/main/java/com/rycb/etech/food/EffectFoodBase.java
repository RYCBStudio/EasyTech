package com.rycb.etech.food;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/7/27 20:17</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.food/FoodBase.java</p>
 * <h1><center>FoodBase</center></h1>
 */
public class EffectFoodBase extends FoodBase implements IHasModel {

    PotionEffect effect1, effect2, effect3;

    public EffectFoodBase(String UnlocalizedName, String RegistryName, int amount, float saturation, boolean isWolfFood, CreativeTabs tab, PotionEffect effect1, @Nullable PotionEffect effect2, @Nullable PotionEffect effect3) {
        super(UnlocalizedName, RegistryName, amount, saturation, isWolfFood, tab);
        setAlwaysEdible();
        this.effect1 = effect1;
        this.effect2 = effect2;
        this.effect3 = effect3;
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(effect1.getPotion(), effect1.getDuration(), effect1.getAmplifier(), effect1.getIsAmbient(), effect1.doesShowParticles()));
            if (!(effect2 == null)) {
                player.addPotionEffect(new PotionEffect(effect2.getPotion(), effect2.getDuration(), effect2.getAmplifier(), effect2.getIsAmbient(), effect2.doesShowParticles()));
                if (!(effect3 == null)) {
                    player.addPotionEffect(new PotionEffect(effect3.getPotion(), effect3.getDuration(), effect3.getAmplifier(), effect3.getIsAmbient(), effect3.doesShowParticles()));
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
