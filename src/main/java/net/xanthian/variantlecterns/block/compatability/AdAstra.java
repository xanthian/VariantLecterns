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

public class AdAstra {

    public static Map<Identifier, Block> AA_LECTERNS = Maps.newHashMap();

    public static Block AA_AERONOS_LECTERN;
    public static Block AA_GLACIAN_LECTERN;
    public static Block AA_STROPHAR_LECTERN;

    public static void registerLecterns() {
        AA_AERONOS_LECTERN = registerLectern("aa_aeronos_lectern");
        AA_GLACIAN_LECTERN = registerLectern("aa_glacian_lectern");
        AA_STROPHAR_LECTERN = registerLectern("aa_strophar_lectern");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        AA_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}