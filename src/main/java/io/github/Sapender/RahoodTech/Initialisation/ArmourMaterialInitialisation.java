package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.Initialisation.tiers.ModArmourMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmourMaterialInitialisation {
    public static final ModArmourMaterial TEST = new ModArmourMaterial(
            new int[] {600,1000,800,400},
            new int[] {12,16,14,11},
            20,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            ()-> Ingredient.of(ItemInitialisation.TEST_ITEM::get),
            "test",
            0.25f,
            0.0f
    );
}
