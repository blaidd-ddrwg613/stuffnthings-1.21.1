package com.blaidd_ddrwg613.stuffnthings.items;

import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class WoodenDagger extends Item
{
    public WoodenDagger(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand)
    {
        if (player.isCrouching())
        {
            float currentHealth = player.getHealth();
            float newHealth = currentHealth - (currentHealth - 1f);

            player.setHealth(newHealth);

            return InteractionResultHolder.success(player.getItemInHand(InteractionHand.MAIN_HAND));
        }

        return InteractionResultHolder.fail(player.getItemInHand(InteractionHand.MAIN_HAND));
    }
}
