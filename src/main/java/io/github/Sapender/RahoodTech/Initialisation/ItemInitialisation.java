package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialisation {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RahoodTech.MOD_ID);

    //NORMAL ITEMS UNDERNEATH//
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(65)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())));

    public static final RegistryObject<Item> ARYA_ITEM = ITEMS.register("arya_item",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(100)
                            .saturationMod(0.5f)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 200, 10000), 1.0f)
                            .build())));

    //BLOCK ITEMS UNDERNEATH//
    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = ITEMS.register("test_block",
            () -> new BlockItem(BlockInitialisation.TEST_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DABABYIUM_ITEM = ITEMS.register("dababyium",
            () -> new BlockItem(BlockInitialisation.DABABYIUM.get(), new Item.Properties()));
}
