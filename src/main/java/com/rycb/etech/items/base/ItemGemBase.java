package com.rycb.etech.items.base;

import com.rycb.etech.EasyTech;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/6 15:37</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.base/ItemGemBase.java</p>
 * <h1><center>ItemGemBase</center></h1>
 */
public class ItemGemBase extends Item implements IHasModel {
    /**
     * @param UnlocalizedName 未初始化名
     * @param RegistryName    注册名
     * @param tab             创造模式物品栏
     */
    public ItemGemBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName("gem" + UnlocalizedName);
        setRegistryName(RegistryName + "_gem");
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyTech.proxy.registerItemRender(this, 0, "inventory");
    }
}
