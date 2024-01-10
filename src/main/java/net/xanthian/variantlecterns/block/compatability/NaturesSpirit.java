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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_LECTERNS = Maps.newHashMap();

    public static Block NS_ASPEN_LECTERN;
    public static Block NS_CYPRESS_LECTERN;
    public static Block NS_FIR_LECTERN;
    public static Block NS_JOSHUA_LECTERN;
    public static Block NS_MAPLE_LECTERN;
    public static Block NS_OLIVE_LECTERN;
    public static Block NS_REDWOOD_LECTERN;
    public static Block NS_SUGI_LECTERN;
    public static Block NS_WILLOW_LECTERN;
    public static Block NS_WISTERIA_LECTERN;

    public static void registerLecterns() {
        NS_ASPEN_LECTERN = registerLectern("ns_aspen_lectern");
        NS_CYPRESS_LECTERN = registerLectern("ns_cypress_lectern");
        NS_FIR_LECTERN = registerLectern("ns_fir_lectern");
        NS_JOSHUA_LECTERN = registerLectern("ns_joshua_lectern");
        NS_MAPLE_LECTERN = registerLectern("ns_maple_lectern");
        NS_OLIVE_LECTERN = registerLectern("ns_olive_lectern");
        NS_REDWOOD_LECTERN = registerLectern("ns_redwood_lectern");
        NS_SUGI_LECTERN = registerLectern("ns_sugi_lectern");
        NS_WILLOW_LECTERN = registerLectern("ns_willow_lectern");
        NS_WISTERIA_LECTERN = registerLectern("ns_wisteria_lectern");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        NS_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}