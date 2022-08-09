package com.rycb.etech.items.single.cheating;

import com.rycb.etech.EasyTech;
import com.rycb.etech.items.base.tools.ToolPickaxe;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/6 17:30</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.items.single.cheating/MCP.java</p>
 * <h1><center>MCP</center></h1>
 */
public class MCP extends ToolPickaxe {
    public MCP(ToolMaterial material) {
        super(material, "mcp", "mcp", EasyTech.ETECH_TAB);
        setNoRepair();
        int MaxDamage = new Random().nextInt() + 999999999;
        setMaxDamage(Math.max(MaxDamage, 1919810));
        setHarvestLevel("pickaxe", 999999999);
        setHarvestLevel("axe", 999999999);
    }
}
