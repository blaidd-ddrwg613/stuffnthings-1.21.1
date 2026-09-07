package com.blaidd_ddrwg613.stuffnthings.items;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(StuffNThings.MODID);


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
