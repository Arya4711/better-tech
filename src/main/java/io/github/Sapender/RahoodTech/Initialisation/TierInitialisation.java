package io.github.Sapender.RahoodTech.Initialisation;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInitialisation {
    public static final ForgeTier TEST = new ForgeTier(
            5,
            2000,
            2.0f,
            3.0f,
            40,
            TagInitialisation.NEEDS_TEST_TOOL,
            () -> Ingredient.of(ItemInitialisation.TEST_ITEM::get)
    );
}
