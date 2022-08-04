package com.rycb.etech.entity.model;
// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWitherKing extends ModelBase {
    private final ModelRenderer wither_king;
    private final ModelRenderer horn_2_r1;
    private final ModelRenderer horn_1_r1;
    private final ModelRenderer tail_right_r1;
    private final ModelRenderer tail_middle_r1;
    private final ModelRenderer tail_left_r1;
    private final ModelRenderer divine_whip_left;
    private final ModelRenderer l_divine_whip_4_r1;
    private final ModelRenderer l_divine_whip_3_r1;
    private final ModelRenderer l_divine_whip_2_r1;
    private final ModelRenderer l_divine_whip_1_r1;
    private final ModelRenderer divine_whip_right;
    private final ModelRenderer r_divine_whip_4_r1;
    private final ModelRenderer r_divine_whip_3_r1;
    private final ModelRenderer r_divine_whip_2_r1;
    private final ModelRenderer r_divine_whip_1_r1;

    public ModelWitherKing() {
        textureWidth = 128;
        textureHeight = 128;

        wither_king = new ModelRenderer(this);
        wither_king.setRotationPoint(0.0F, 24.0F, 0.0F);
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 50, -1.5F, -41.0F, -6.0F, 3, 37, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 44, -12.5F, -18.0F, -6.0F, 25, 3, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 38, -12.5F, -13.0F, -6.0F, 25, 3, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 36, 14, -12.5F, -8.0F, -6.0F, 25, 3, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 36, 8, -12.5F, -23.0F, -6.0F, 25, 3, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 32, -12.5F, -28.0F, -6.0F, 25, 3, 3, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 0, -22.5F, -35.0F, -7.0F, 45, 4, 4, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 12, 50, 8.0F, -45.0F, -9.0F, 8, 8, 8, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 8, -6.0F, -53.0F, -11.0F, 12, 12, 12, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 48, 42, -16.0F, -45.0F, -8.0F, 8, 8, 8, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 12, 50, 11.0F, -39.0F, -6.0F, 2, 5, 2, 0.0F, false));
        wither_king.cubeList.add(new ModelBox(wither_king, 0, 8, -13.0F, -39.0F, -6.0F, 2, 5, 2, 0.0F, false));

        horn_2_r1 = new ModelRenderer(this);
        horn_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(horn_2_r1);
        setRotationAngle(horn_2_r1, 0.6549F, -0.1802F, 2.0488F);
        horn_2_r1.cubeList.add(new ModelBox(horn_2_r1, 48, 20, -55.0F, -2.0F, 1.0F, 18, 3, 3, 0.0F, false));

        horn_1_r1 = new ModelRenderer(this);
        horn_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(horn_1_r1);
        setRotationAngle(horn_1_r1, 0.7245F, 0.1758F, 1.3758F);
        horn_1_r1.cubeList.add(new ModelBox(horn_1_r1, 48, 26, -51.0F, 0.0F, -18.0F, 18, 3, 3, 0.0F, false));

        tail_right_r1 = new ModelRenderer(this);
        tail_right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(tail_right_r1);
        setRotationAngle(tail_right_r1, 2.0344F, 0.6591F, -0.8861F);
        tail_right_r1.cubeList.add(new ModelBox(tail_right_r1, 44, 58, -5.0F, -1.0F, 2.5F, 11, 3, 3, 0.0F, false));

        tail_middle_r1 = new ModelRenderer(this);
        tail_middle_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(tail_middle_r1);
        setRotationAngle(tail_middle_r1, 1.5708F, 0.7854F, -1.5708F);
        tail_middle_r1.cubeList.add(new ModelBox(tail_middle_r1, 53, 35, -10.0F, -1.0F, -1.5F, 17, 3, 3, 0.0F, false));

        tail_left_r1 = new ModelRenderer(this);
        tail_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(tail_left_r1);
        setRotationAngle(tail_left_r1, 1.05F, 0.6178F, -2.3513F);
        tail_left_r1.cubeList.add(new ModelBox(tail_left_r1, 41, 64, -5.0F, -1.0F, -5.5F, 11, 3, 3, 0.0F, false));

        divine_whip_left = new ModelRenderer(this);
        divine_whip_left.setRotationPoint(0.0F, 0.0F, 0.0F);
        wither_king.addChild(divine_whip_left);


        l_divine_whip_4_r1 = new ModelRenderer(this);
        l_divine_whip_4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_left.addChild(l_divine_whip_4_r1);
        setRotationAngle(l_divine_whip_4_r1, 1.4399F, 0.0F, 0.0F);
        l_divine_whip_4_r1.cubeList.add(new ModelBox(l_divine_whip_4_r1, 78, 56, 18.0F, 16.0F, 19.0F, 2, 12, 2, 0.0F, false));

        l_divine_whip_3_r1 = new ModelRenderer(this);
        l_divine_whip_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_left.addChild(l_divine_whip_3_r1);
        setRotationAngle(l_divine_whip_3_r1, 1.309F, 0.0F, 0.0F);
        l_divine_whip_3_r1.cubeList.add(new ModelBox(l_divine_whip_3_r1, 12, 82, 18.0F, 3.0F, 21.0F, 2, 12, 2, 0.0F, false));

        l_divine_whip_2_r1 = new ModelRenderer(this);
        l_divine_whip_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_left.addChild(l_divine_whip_2_r1);
        setRotationAngle(l_divine_whip_2_r1, 1.0472F, 0.0F, 0.0F);
        l_divine_whip_2_r1.cubeList.add(new ModelBox(l_divine_whip_2_r1, 65, 66, 17.0F, -13.0F, 20.0F, 4, 12, 4, 0.0F, false));

        l_divine_whip_1_r1 = new ModelRenderer(this);
        l_divine_whip_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_left.addChild(l_divine_whip_1_r1);
        setRotationAngle(l_divine_whip_1_r1, 0.4363F, 0.0F, 0.0F);
        l_divine_whip_1_r1.cubeList.add(new ModelBox(l_divine_whip_1_r1, 44, 70, 17.0F, -32.0F, 9.0F, 4, 12, 4, 0.0F, false));

        divine_whip_right = new ModelRenderer(this);
        divine_whip_right.setRotationPoint(-37.0F, 0.0F, 0.0F);
        wither_king.addChild(divine_whip_right);


        r_divine_whip_4_r1 = new ModelRenderer(this);
        r_divine_whip_4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_right.addChild(r_divine_whip_4_r1);
        setRotationAngle(r_divine_whip_4_r1, 1.4399F, 0.0F, 0.0F);
        r_divine_whip_4_r1.cubeList.add(new ModelBox(r_divine_whip_4_r1, 78, 56, 18.0F, 16.0F, 20.0F, 2, 12, 2, 0.0F, false));

        r_divine_whip_3_r1 = new ModelRenderer(this);
        r_divine_whip_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_right.addChild(r_divine_whip_3_r1);
        setRotationAngle(r_divine_whip_3_r1, 1.309F, 0.0F, 0.0F);
        r_divine_whip_3_r1.cubeList.add(new ModelBox(r_divine_whip_3_r1, 80, 41, 18.0F, 3.0F, 22.0F, 2, 12, 2, 0.0F, false));

        r_divine_whip_2_r1 = new ModelRenderer(this);
        r_divine_whip_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_right.addChild(r_divine_whip_2_r1);
        setRotationAngle(r_divine_whip_2_r1, 1.0472F, 0.0F, 0.0F);
        r_divine_whip_2_r1.cubeList.add(new ModelBox(r_divine_whip_2_r1, 12, 66, 17.0F, -13.0F, 20.0F, 4, 12, 4, 0.0F, false));

        r_divine_whip_1_r1 = new ModelRenderer(this);
        r_divine_whip_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        divine_whip_right.addChild(r_divine_whip_1_r1);
        setRotationAngle(r_divine_whip_1_r1, 0.4363F, 0.0F, 0.0F);
        r_divine_whip_1_r1.cubeList.add(new ModelBox(r_divine_whip_1_r1, 28, 66, 17.0F, -32.0F, 9.0F, 4, 12, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        wither_king.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}