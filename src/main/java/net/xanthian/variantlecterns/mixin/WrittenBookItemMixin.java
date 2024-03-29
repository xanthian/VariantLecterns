package net.xanthian.variantlecterns.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.WrittenBookItem;
import net.xanthian.variantlecterns.block.VariantLecternBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(WrittenBookItem.class)
public class WrittenBookItemMixin {

    @WrapOperation(method = "useOnBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean variantlecterns$customLecternBlockforWrittenBook(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.getBlock() instanceof VariantLecternBlock;
    }
}
