package com.rycb.etech.entity;

import com.rycb.etech.EasyTech;
import com.rycb.etech.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/4 11:52</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.entity/EntityInit.java</p>
 * <h1><center>EntityInit</center></h1>
 */
public class EntityInit {

    //对生物信息进行注册
    public static void registerEntities() {
        //生物名称，所编写的生物类，在Reference中的名称，追踪范围，生物蛋颜色1，颜色2
        registerEntity("wither_king", EntityWitherKing.class, Reference.WitherKing, 50, 6760862, 0);
    }


    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {

        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, EasyTech.instance, range, 1, true, color1, color2);

    }
}
