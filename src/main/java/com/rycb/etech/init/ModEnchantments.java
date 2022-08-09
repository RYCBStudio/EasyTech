package com.rycb.etech.init;

import com.rycb.etech.enchantment.EnchantmentMalicious;
import com.rycb.etech.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/8 12:39</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.init/ModEnchantments.java</p>
 * <h1><center>ModEnchantments</center></h1>
 */

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModEnchantments {
    public static final List<Enchantment> ENCHANTNENTS = new ArrayList<Enchantment>();
    public static final Enchantment ENCHANTMENT_MALICIOUS = new EnchantmentMalicious();
    
    @SubscribeEvent
    public static void EnchantmentsRegister(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase living = event.getEntityLiving();
        int level = EnchantmentHelper.getMaxEnchantmentLevel(ENCHANTMENT_MALICIOUS, living);
        BlockPos pos = living.getPosition();
        World world = event.getEntity().world;
    }
}
