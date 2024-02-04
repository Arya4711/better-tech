package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.Sapender.RahoodTech.Initialisation.CreativeTabInitialisation.addToTab;

public class ItemInitialisation {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RahoodTech.MOD_ID);

    //NORMAL ITEMS UNDERNEATH//
    public static final RegistryObject<Item> TEST_ITEM = addToTab(ITEMS.register("test_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(65)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build()))));
    //TOOLS UNDERNEATH//
    public static final RegistryObject<PickaxeItem> TEST_PICKAXE = addToTab(ITEMS.register("test_pickaxe",
            () -> new PickaxeItem(TierInitialisation.TEST,7,2.5f,new Item.Properties().durability(10000))
    ));

    //ARMOUR UNDERNEATH//
    public static final RegistryObject<ArmorItem> TEST_HELMET = addToTab(ITEMS.register("test_helmet",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.HELMET,new Item.Properties())));

    public static final RegistryObject<ArmorItem> TEST_CHESTPLATE = addToTab(ITEMS.register("test_chestplate",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.CHESTPLATE,new Item.Properties())));

    public static final RegistryObject<ArmorItem> TEST_LEGGINGS = addToTab(ITEMS.register("test_leggings",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.LEGGINGS,new Item.Properties())));

    public static final RegistryObject<ArmorItem> TEST_BOOTS = addToTab(ITEMS.register("test_boots",
            () -> new ArmorItem(ArmourMaterialInitialisation.TEST,ArmorItem.Type.BOOTS,new Item.Properties())));


    public static final RegistryObject<Item> ARYA_ITEM = addToTab(ITEMS.register("arya_item",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(100)
                            .saturationMod(0.5f)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 200, 10000), 1.0f)
                            .build())
            )));

    //BLOCK ITEMS UNDERNEATH//
    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = addToTab(ITEMS.register("test_block",
            () -> new BlockItem(BlockInitialisation.TEST_BLOCK.get(), new Item.Properties())));


    public static final RegistryObject<BlockItem> DABABYIUM_ITEM = addToTab(ITEMS.register("dababyium",
            () -> new BlockItem(BlockInitialisation.DABABYIUM.get(), new Item.Properties())));

    public static final RegistryObject<BlockItem> FRELITE_ORE = addToTab(ITEMS.register("frelite_ore",
            () -> new BlockItem(BlockInitialisation.FRELITE_ORE.get(), new Item.Properties())));

    public static final RegistryObject<BlockItem> PYRITE_ORE = addToTab(ITEMS.register("pyrite_ore",
            () -> new BlockItem(BlockInitialisation.PYRITE_ORE.get(), new Item.Properties())));

    public static final RegistryObject<BlockItem> SALPHYNITE_ORE = addToTab(ITEMS.register("salphynite_ore",
            () -> new BlockItem(BlockInitialisation.SALPHYNITE_ORE.get(), new Item.Properties())));
}
