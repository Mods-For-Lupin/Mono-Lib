package net.jason13.monolib.methods;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

@Deprecated(since = "4.0.0", forRemoval = true)
public class BlockMethods {

  @Deprecated(since = "4.0.0", forRemoval = true)
  public static boolean compareBlockToItemStack(Block block, ItemStack stack) {

    if (block == null || stack == null) {
      return false;
    }

    return !stack.isEmpty() && block.equals(Block.byItem(stack.getItem()));
  }
}
