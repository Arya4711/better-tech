package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import io.github.Sapender.RahoodTech.sound.ModSounds;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInitialisation {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RahoodTech.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .lightLevel(value -> 15)
                    .requiresCorrectToolForDrops()
                    .sound(ModSounds.TEST_BLOCK_SOUNDS)
            ));

    public static final RegistryObject<Block> DABABYIUM = BLOCKS.register("dababyium",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(ModSounds.DABABYIUM_BLOCK_SOUNDS)
            ));
}
