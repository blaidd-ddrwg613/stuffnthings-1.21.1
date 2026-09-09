package com.blaidd_ddrwg613.stuffnthings.items;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
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
