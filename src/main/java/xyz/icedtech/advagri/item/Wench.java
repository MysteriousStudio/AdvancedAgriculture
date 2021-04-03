package xyz.icedtech.advagri.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import xyz.icedtech.advagri.block.machines.Machine;

public class Wench extends Item {
    public Wench(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (Machine.class.isAssignableFrom(context.getWorld().getBlockState(context.getBlockPos()).getBlock().getClass()) && context.getPlayer().isInSneakingPose()) {
            context.getWorld().breakBlock(context.getBlockPos(), true);
            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }
}
