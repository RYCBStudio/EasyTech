package com.rycb.etech.util.handlers;


import com.rycb.etech.entity.EntityInit;
import com.rycb.etech.init.ModBlocks;
import com.rycb.etech.init.ModEnchantments;
import com.rycb.etech.init.ModFluids;
import com.rycb.etech.init.ModItems;
import com.rycb.etech.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {


    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }

        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
    
    @SubscribeEvent
    public static void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(ModEnchantments.ENCHANTNENTS.toArray(new Enchantment[0]));
    }
    
    public static void preInitRegistries() {
        ModFluids.registerFluids();
        RenderHandler.registerCustomMeshesAndStates();
        RenderHandler.registerEntityRenders();
        EntityInit.registerEntities();
    }
    
    public static void initRegistries() {
        //TODO
    }
}
