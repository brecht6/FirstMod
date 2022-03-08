package net.brecht6.firstmod.sound;

import net.brecht6.firstmod.FirstMod;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {


    public static SoundEvent UNDERWATERBEATS_DELETE = registerSoundEvent("underwaterbeats-delete");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FirstMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
