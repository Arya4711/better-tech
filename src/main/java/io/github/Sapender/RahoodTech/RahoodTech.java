package io.github.Sapender.RahoodTech;

import io.github.Sapender.RahoodTech.Initialisation.BlockInitialisation;
import io.github.Sapender.RahoodTech.Initialisation.CreativeTabInitialisation;
import io.github.Sapender.RahoodTech.Initialisation.ItemInitialisation;
import io.github.Sapender.RahoodTech.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RahoodTech.MOD_ID)
public class RahoodTech {
    public static final String MOD_ID = "rahoodtech";

    public RahoodTech(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeTabInitialisation.TABS.register(bus);
        ItemInitialisation.ITEMS.register(bus);
        BlockInitialisation.BLOCKS.register(bus);
        ModSounds.SOUND_EVENTS.register(bus);
    }
}
