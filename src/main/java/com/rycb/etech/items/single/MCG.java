package com.rycb.etech.items.single;

import com.rycb.etech.EasyTech;
import com.rycb.etech.items.base.tools.ToolSword;
import net.minecraft.item.ItemStack;

import java.util.Random;

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
        int MaxDamage = new Random().nextInt();
        setMaxDamage(Math.max(MaxDamage, 1919810));
    }
}
