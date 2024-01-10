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

public class Bewitchment {

    public static Map<Identifier, Block> BW_LECTERNS = Maps.newHashMap();

    public static Block BW_CYPRESS_LECTERN;
    public static Block BW_DRAGONS_BLOOD_LECTERN;
    public static Block BW_ELDER_LECTERN;
    public static Block BW_JUNIPER_LECTERN;

    public static void registerLecterns() {
        BW_CYPRESS_LECTERN = registerLectern("bw_cypress_lectern");
        BW_DRAGONS_BLOOD_LECTERN = registerLectern("bw_dragons_blood_lectern");
        BW_ELDER_LECTERN = registerLectern("bw_elder_lectern");
        BW_JUNIPER_LECTERN = registerLectern("bw_juniper_lectern");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BW_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}