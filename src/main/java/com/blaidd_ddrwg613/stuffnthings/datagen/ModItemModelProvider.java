package com.blaidd_ddrwg613.stuffnthings.datagen;

import com.blaidd_ddrwg613.stuffnthings.StuffNThings;
import com.blaidd_ddrwg613.stuffnthings.common.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, StuffNThings.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(ModItems.WOODEN_DAGGER.get());
    }
}
