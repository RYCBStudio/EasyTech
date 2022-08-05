package com.rycb.etech.entity;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.World;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/4 11:58</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.entity/EntityWitherKing.java</p>
 * <h1><center>EntityWitherKing</center></h1>
 */
public class EntityWitherKing extends EntityWither {
    public EntityWitherKing(World worldIn) {
        super(worldIn);
        float health = Math.max(new Random().nextFloat(), 12000.16f);
        setHealth(health);
        setNoAI(false);
    }
}
