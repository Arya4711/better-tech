package io.github.Sapender.RahoodTech.Initialisation;

import io.github.Sapender.RahoodTech.RahoodTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInitialisation {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RahoodTech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAHOODTECH_TAB = TABS.register("rahoodtech",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.rahoodtech"))
                    .icon(ItemInitialisation.TEST_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ItemInitialisation.TEST_ITEM.get());
                        output.accept(ItemInitialisation.ARYA_ITEM.get());
                        output.accept(ItemInitialisation.DABABYIUM_ITEM.get());
                    })
                    .build()
    );
}
