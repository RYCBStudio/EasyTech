package com.rycb.etech.blocks.tileentity;

import com.rycb.etech.blocks.container.ContainerBlastFurnace;
import com.rycb.etech.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/11 16:57</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.blocks.tileentity/GuiBlastFurnace.java</p>
 * <h1><center>GuiBlastFurnace</center></h1>
 */
public class GuiBlastFurnace extends GuiContainer {
    
    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/blast_furnace.png");
    private final InventoryPlayer player;
    private final TileEntityBlastFurnace tileEntityBlastFurnace;
    
    public GuiBlastFurnace(InventoryPlayer player, TileEntityBlastFurnace tileentity) {
        super(new ContainerBlastFurnace(player, tileentity));
        this.player = player;
        this.tileEntityBlastFurnace = tileentity;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String tileName = this.tileEntityBlastFurnace.getDisplayName().getUnformattedText();
        this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(TEXTURES);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        
        if (TileEntityBlastFurnace.isBurning(tileEntityBlastFurnace)) {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 54 + 12 - k, 176, 12 - k, 14, k + 1);
        }
        
        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(this.guiLeft + 44, this.guiTop + 36, 176, 14, l + 1, 16);
    }
    
    private int getBurnLeftScaled(int pixels) {
        int i = this.tileEntityBlastFurnace.getField(1);
        if (i == 0) i = 200;
        return this.tileEntityBlastFurnace.getField(0) * pixels / i;
    }
    
    private int getCookProgressScaled(int pixels) {
        int i = this.tileEntityBlastFurnace.getField(2);
        int j = this.tileEntityBlastFurnace.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }
}
