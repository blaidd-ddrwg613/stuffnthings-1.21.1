package com.blaidd_ddrwg613.stuffnthings.blocks;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StuffNThings.MODID);


    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
