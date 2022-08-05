package com.rycb.etech.items.single;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.rycb.etech.items.single.EnchantedGlisteningMelon.normalEnchantedFoodEffectsAdder;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/4 10:48</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.single/EnchantedGoldenCarrot.java</p>
 * <h1><center>EnchantedGoldenCarrot</center></h1>
 */
public class GlisteningMelon extends ItemFood implements IHasModel {

    public GlisteningMelon() {
        super(3, 8.4f, false);
        setRegistryName("glistening_melon");
        setUnlocalizedName("glisteningMelon");
        setAlwaysEdible();
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        normalEnchantedFoodEffectsAdder(player);
    }
}
