package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInitialisation {
    public static final TagKey<Block> NEEDS_TEST_TOOL = tag("needs_test_tool");

    private static TagKey<Block> tag(String name) { return BlockTags.create(new ResourceLocation(RahoodTech.MOD_ID,name));
    }
}
