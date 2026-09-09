package com.blaidd_ddrwg613.stuffnthings.common.items;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import com.blaidd_ddrwg613.stuffnthings.common.items.custom.WoodenDagger;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StuffNThings.MODID);

    public static final DeferredItem<Item> WOODEN_DAGGER = ITEMS.register("wooden_dagger", ()->
            new WoodenDagger(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
