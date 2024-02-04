package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialisation {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RahoodTech.MODID);

    //NORMAL ITEMS UNDERNEATH//
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(65)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())));
    //TOOLS UNDERNEATH//
    public static final RegistryObject<PickaxeItem> TEST_PICKAXE = ITEMS.register("test_pickaxe",
            () -> new PickaxeItem(TierInitialisation.TEST,7,2.5f,new Item.Properties().durability(10000))
    );

    //ARMOUR UNDERNEATH//
    public static final RegistryObject<ArmorItem> TEST_HELMET = ITEMS.register("test_helmet",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.HELMET,new Item.Properties()));

    public static final RegistryObject<ArmorItem> TEST_CHESTPLATE = ITEMS.register("test_chestplate",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.CHESTPLATE,new Item.Properties()));

    public static final RegistryObject<ArmorItem> TEST_LEGGINGS = ITEMS.register("test_leggings",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.LEGGINGS,new Item.Properties()));

    public static final RegistryObject<ArmorItem> TEST_BOOTS = ITEMS.register("test_boots",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.BOOTS,new Item.Properties()));


    //BLOCK ITEMS UNDERNEATH//
    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = ITEMS.register("test_block",
            () -> new BlockItem(BlockInitialisation.TEST_BLOCK.get(), new Item.Properties()));

}
