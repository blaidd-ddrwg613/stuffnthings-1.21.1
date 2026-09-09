package com.blaidd_ddrwg613.stuffnthings;

import com.blaidd_ddrwg613.stuffnthings.common.ModCreativeTabs;
import com.blaidd_ddrwg613.stuffnthings.common.blocks.ModBlocks;
import com.blaidd_ddrwg613.stuffnthings.common.items.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(StuffNThings.MODID)
public class StuffNThings
{
    public static final String MODID = "stuffnthings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StuffNThings(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
