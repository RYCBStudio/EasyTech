package com.rycb.etech.items.single;

import com.rycb.etech.EasyTech;
import com.rycb.etech.items.base.tools.ToolSword;
import net.minecraft.item.ItemStack;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/2 20:44</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.single/MCG.java</p>
 * <h1><center>MCG</center></h1>
 */
public class MCG extends ToolSword {
    public MCG(ToolMaterial material) {
        super(material, "Icon", "icon_item", EasyTech.ETECH_TAB);
        setMaxDamage(1919810);
        setDamage(new ItemStack(this), 100);
    }
}
