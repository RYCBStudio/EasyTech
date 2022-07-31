//package com.rycb.etech.block.tileentity;
//
//import com.rycb.etech.util.Reference;
//import net.minecraft.client.gui.inventory.GuiContainer;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.entity.player.InventoryPlayer;
//import net.minecraft.util.ResourceLocation;
//
///**
// * @author RYCBStudio/Java Department
// * <p>Create Time: 2022/7/30 20:03</p>
// * <p>Use the IntelliJ IDEA</p>
// * <p>Location: EasyTech/com.rycb.etech.block.tileentity/GuiMaterialPresser.java</p>
// * <h1><center>GuiMaterialPresser</center></h1>
// */
//public class GuiMaterialPresser extends GuiContainer {
//
//    /**
//     * Pass the path of GUI interface in the first step to texts
//     */
//    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/material_presser.png");
//    private final InventoryPlayer player;
//    private final TileEntityMaterialPresser tileEntity;
//
//    public GuiMaterialPresser(InventoryPlayer player, TileEntityMaterialPresser tileEntity) {
//        super(new ContainerMaterialPresser(player, tileEntity));
//        this.player = player;
//        this.tileEntity = tileEntity;
//    }
//
//    @Override
//    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
//        String tileName = this.tileEntity.getDisplayName().getUnformattedText();
//        /* Display the name of the machine on the top of the GUI interface */
//        this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);
//        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
//    }
//
//    /**
//     * Draw the entire GUI page
//     */
//    @Override
//    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
//        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
//        this.mc.getTextureManager().bindTexture(TEXTURES);
//        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
//
//
//        if (TileEntityMaterialPresser.isBurning(tileEntity)) {
//            int k = this.getBurnLeftScaled(13);
//            this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 54 + 12 - k, 0, 0, this.xSize, this.ySize);
//        }
//
//        int l = this.getMakeProgressScaled(24);
//        this.drawTexturedModalRect(this.guiLeft + 44, this.guiTop + 36, 176, 14, l + 1, 16);
//    }
//
//    private int getBurnLeftScaled(int pixels) {
//        int i = this.tileEntity.getField(1);
//        if (i == 0) i = 200;
//        return this.tileEntity.getField(0) * pixels / i;
//    }
//
//    private int getMakeProgressScaled(int pixels) {
//        int i = this.tileEntity.getField(2);
//        int j = this.tileEntity.getField(3);
//        return j != 0 && i != 0 ? i * pixels / j : 0;
//    }
//}
