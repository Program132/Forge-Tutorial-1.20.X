package fr.program.tutomod.item.custom;

import fr.program.tutomod.util.ModTags;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();

        if (!pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = pContext.getLevel().getBlockState(positionClicked.below(i));

                if (isValuableBlock(state)) {
                    sendValuableCoordinates(positionClicked.below(i), player, state.getBlock());

                    foundBlock = true;
                    break;
                }
            }

            if (!foundBlock) {
                player.sendSystemMessage(Component.literal(
                        "No block found"
                ));
            }

        }

        pContext.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(p.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void sendValuableCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal(
                "Found : " + I18n.get(block.getDescriptionId()) + " at " + "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"
        ));
    }

    private boolean isValuableBlock(BlockState state) {
        // Basic : return state.is(Blocks.IRON_ORE) || state.is(Blocks.DIAMOND_ORE);
        // With tags :
        return state.is(ModTags.Blocks.METAL_DETECTOR_VALUABLES);
    }
}
