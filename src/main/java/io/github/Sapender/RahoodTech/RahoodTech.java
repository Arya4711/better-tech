package io.github.Sapender.RahoodTech;

import io.github.Sapender.RahoodTech.Initialisation.BlockInitialisation;
import io.github.Sapender.RahoodTech.Initialisation.ItemInitialisation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RahoodTech.MODID)
public class RahoodTech {
    public static final String MODID = "rahoodtech";

    public RahoodTech(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInitialisation.ITEMS.register(bus);
        BlockInitialisation.BLOCKS.register(bus);
    }
}
