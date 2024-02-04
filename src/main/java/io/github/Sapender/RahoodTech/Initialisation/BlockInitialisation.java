package io.github.Sapender.RahoodTech.Initialisation;

import com.mojang.blaze3d.shaders.Uniform;
import io.github.Sapender.RahoodTech.RahoodTech;
import io.github.Sapender.RahoodTech.sound.ModSounds;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
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
    //ORES BENEATH//

    public static final RegistryObject<DropExperienceBlock> FRELITE_ORE = BLOCKS.register("frelite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(10,15)));

    public static final  RegistryObject<DropExperienceBlock> PYRITE_ORE = BLOCKS.register("pyrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS), UniformInt.of(20,30)));

    public static final RegistryObject<DropExperienceBlock> SALPHYNITE_ORE = BLOCKS.register("salphynite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), UniformInt.of(30,45)));
}
