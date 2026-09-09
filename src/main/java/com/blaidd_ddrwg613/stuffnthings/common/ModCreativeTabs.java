package com.blaidd_ddrwg613.stuffnthings.common;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import com.blaidd_ddrwg613.stuffnthings.common.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StuffNThings.MODID);

    public static final Supplier<CreativeModeTab> StuffNThingsCreativeTab = CREATIVE_MODE_TABS.register
            ("stuffnthings_creative_tab", ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.stuffnthings.creativetab"))
                    .displayItems((items, output) ->
                            {
                                ModItems.ITEMS.getEntries().forEach((item) ->
                                { output.accept(item.get());});
                            }
                            ).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
