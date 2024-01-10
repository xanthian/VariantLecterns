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

public class Promenade {

    public static Map<Identifier, Block> PROM_LECTERNS = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_LECTERN;
    public static Block PROM_MAPLE_LECTERN;
    public static Block PROM_PALM_LECTERN;
    public static Block PROM_SAKURA_LECTERN;

    public static void registerLecterns() {
        PROM_DARK_AMARANTH_LECTERN = registerLectern("prom_dark_amaranth_lectern");
        PROM_MAPLE_LECTERN = registerLectern("prom_maple_lectern");
        PROM_PALM_LECTERN = registerLectern("prom_palm_lectern");
        PROM_SAKURA_LECTERN = registerLectern("prom_sakura_lectern");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}