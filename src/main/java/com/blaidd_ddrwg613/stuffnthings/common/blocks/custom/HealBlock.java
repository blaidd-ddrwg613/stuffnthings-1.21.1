package com.blaidd_ddrwg613.stuffnthings.common.blocks.custom;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.lwjgl.glfw.GLFW;

public class HealBlock extends Block
{
    public HealBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity)
    {
        if (entity instanceof Player player)
        {
            if (player != null)
            {
                player.heal(1.0f);
                player.getFoodData().setSaturation(20);
            }

            Minecraft minecraft =Minecraft.getInstance();
            long window = minecraft.getWindow().getWindow();

            if (InputConstants.isKeyDown(window, GLFW.GLFW_KEY_G))
            {
                minecraft.gui.getChat().clearMessages(false);

                player.sendSystemMessage(Component.literal("Saturation: " + player.getFoodData().getSaturationLevel()));
            }
        }
    }
}
