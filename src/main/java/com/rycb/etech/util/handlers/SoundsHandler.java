package com.rycb.etech.util.handlers;

import com.rycb.etech.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
    //你所要进行设置的声音事件
    public static SoundEvent MCG_FIRE, MCG_NO_BULLET;

    //注册声音事件
    public static void registerSounds() {
        MCG_FIRE = registerSound("entity.mcg.bullet.fire");
        //MCG_NO_BULLET = registerSound("entity.mcg.bullet.empty");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
