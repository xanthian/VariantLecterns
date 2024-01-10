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

public class Botania {

    public static Map<Identifier, Block> BOT_LECTERNS = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_LECTERN;
    public static Block BOT_LIVINGWOOD_LECTERN;
    public static Block BOT_SHIMMERWOOD_LECTERN;

    public static void registerLecterns() {
        BOT_DREAMWOOD_LECTERN = registerLectern("bot_dreamwood_lectern");
        BOT_LIVINGWOOD_LECTERN = registerLectern("bot_livingwood_lectern");
        BOT_SHIMMERWOOD_LECTERN = registerLectern("bot_shimmerwood_lectern");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}