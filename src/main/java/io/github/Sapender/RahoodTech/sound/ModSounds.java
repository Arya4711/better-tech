package io.github.Sapender.RahoodTech.sound;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RahoodTech.MOD_ID);

    public static final RegistryObject<SoundEvent> DABABYIUM_BLOCK_PLACE = registerSoundEvents("dababyium_block_place");
    public static final RegistryObject<SoundEvent> DABABYIUM_BLOCK_BREAK = registerSoundEvents("dababyium_block_break");
    public static final RegistryObject<SoundEvent> DABABYIUM_BLOCK_STEP = registerSoundEvents("dababyium_block_step");
    public static final RegistryObject<SoundEvent> DABABYIUM_BLOCK_FALL = registerSoundEvents("dababyium_block_fall");
    public static final RegistryObject<SoundEvent> DABABYIUM_BLOCK_HIT = registerSoundEvents("dababyium_block_hit");

    public static final ForgeSoundType DABABYIUM_BLOCK_SOUNDS = new ForgeSoundType(
            1f,
            1f,
            ModSounds.DABABYIUM_BLOCK_BREAK,
            ModSounds.DABABYIUM_BLOCK_STEP,
            ModSounds.DABABYIUM_BLOCK_PLACE,
            ModSounds.DABABYIUM_BLOCK_HIT,
            ModSounds.DABABYIUM_BLOCK_FALL);

    public static final RegistryObject<SoundEvent> TEST_BLOCK_PLACE = registerSoundEvents("test_block_place");
    public static final RegistryObject<SoundEvent> TEST_BLOCK_BREAK = registerSoundEvents("test_block_break");
    public static final RegistryObject<SoundEvent> TEST_BLOCK_STEP = registerSoundEvents("test_block_step");
    public static final RegistryObject<SoundEvent> TEST_BLOCK_FALL = registerSoundEvents("test_block_fall");
    public static final RegistryObject<SoundEvent> TEST_BLOCK_HIT = registerSoundEvents("test_block_hit");

    public static final ForgeSoundType TEST_BLOCK_SOUNDS = new ForgeSoundType(
            1f,
            1f,
            ModSounds.TEST_BLOCK_BREAK,
            ModSounds.TEST_BLOCK_STEP,
            ModSounds.TEST_BLOCK_PLACE,
            ModSounds.TEST_BLOCK_HIT,
            ModSounds.TEST_BLOCK_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(
                name,
                () -> SoundEvent.createVariableRangeEvent(
                        new ResourceLocation(
                                RahoodTech.MOD_ID,
                                name)
                )
        );
    }

}