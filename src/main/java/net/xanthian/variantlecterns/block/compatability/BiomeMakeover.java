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

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_LECTERNS = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_LECTERN;
    public static Block BM_BLIGHTED_BALSA_LECTERN;
    public static Block BM_SWAMP_CYPRESS_LECTERN;
    public static Block BM_WILLOW_LECTERN;

    public static void registerLecterns() {
        BM_ANCIENT_OAK_LECTERN = registerLectern("bm_ancient_oak_lectern");
        BM_BLIGHTED_BALSA_LECTERN = registerLectern("bm_blighted_balsa_lectern");
        BM_SWAMP_CYPRESS_LECTERN = registerLectern("bm_swamp_cypress_lectern");
        BM_WILLOW_LECTERN = registerLectern("bm_willow_lectern");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}