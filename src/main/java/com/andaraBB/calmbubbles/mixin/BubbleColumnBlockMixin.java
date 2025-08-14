package com.andaraBB.calmbubbles.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BubbleColumnBlock.class)
public abstract class BubbleColumnBlockMixin {

    @Inject(method = "entityInside", at = @At("HEAD"), cancellable = true)
    private void calmbubbles$disableBubblePushPull(BlockState state, Level level, BlockPos pos, Entity entity, CallbackInfo ci) {
        if (state.is(Blocks.BUBBLE_COLUMN)) {
            ci.cancel(); // Neutralise totalement la poussée/aspiration
        }
    }
}
