package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = RahoodTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInitialisation {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RahoodTech.MOD_ID);
    public static final List<Supplier<? extends ItemLike>> RAHOODTECH_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> RAHOODTECH_TAB = TABS.register("rahoodtech",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.rahoodtech"))
                    .icon(ItemInitialisation.TEST_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        RAHOODTECH_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static <T extends ItemLike> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        RAHOODTECH_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.getEntries().putAfter(Items.DEEPSLATE_DIAMOND_ORE.getDefaultInstance(), ItemInitialisation.FRELITE_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemInitialisation.FRELITE_ORE.get().getDefaultInstance(), ItemInitialisation.PYRITE_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemInitialisation.PYRITE_ORE.get().getDefaultInstance(), ItemInitialisation.SALPHYNITE_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
