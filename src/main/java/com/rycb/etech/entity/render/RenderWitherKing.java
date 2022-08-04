package com.rycb.etech.entity.render;

import com.rycb.etech.entity.EntityWitherKing;
import com.rycb.etech.entity.model.ModelWitherKing;
import com.rycb.etech.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/4 11:59</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.entity.render/RenderWitherKing.java</p>
 * <h1><center>RenderWitherKing</center></h1>
 */
public class RenderWitherKing extends RenderLiving<EntityWitherKing> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/wither_king.png");

    public RenderWitherKing(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelWitherKing(), 0.5f);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityWitherKing entity) {
        return TEXTURES;
    }
}
