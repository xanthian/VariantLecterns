package net.xanthian.variantlecterns.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.Initialise;
import net.xanthian.variantlecterns.block.VariantLecternBlock;

import java.util.Map;

public class MineCells {

    public static Map<Identifier, Block> MC_LECTERNS = Maps.newHashMap();

    public static Block MC_PUTRID_LECTERN;

    public static void registerLecterns() {
        MC_PUTRID_LECTERN = registerLectern("mc_putrid_lectern");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        MC_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}