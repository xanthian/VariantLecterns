package net.xanthian.variantlecterns.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.Initialise;

import java.util.Map;

public class Vanilla {

    public static final VariantLecternBlock ACACIA_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock BAMBOO_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock BIRCH_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock CHERRY_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock CRIMSON_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock DARK_OAK_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock JUNGLE_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock MANGROVE_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock SPRUCE_LECTERN = new VariantLecternBlock();
    public static final VariantLecternBlock WARPED_LECTERN = new VariantLecternBlock();
    public static Map<Identifier, Block> VANILLA_LECTERNS = Maps.newHashMap();

    public static void registerVanillaLecterns() {
        registerLecternBlock("acacia_lectern", ACACIA_LECTERN);
        registerLecternBlock("bamboo_lectern", BAMBOO_LECTERN);
        registerLecternBlock("birch_lectern", BIRCH_LECTERN);
        registerLecternBlock("cherry_lectern", CHERRY_LECTERN);
        registerLecternBlock("crimson_lectern", CRIMSON_LECTERN);
        registerLecternBlock("dark_oak_lectern", DARK_OAK_LECTERN);
        registerLecternBlock("jungle_lectern", JUNGLE_LECTERN);
        registerLecternBlock("mangrove_lectern", MANGROVE_LECTERN);
        registerLecternBlock("spruce_lectern", SPRUCE_LECTERN);
        registerLecternBlock("warped_lectern", WARPED_LECTERN);
    }

    private static void registerLecternBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        VANILLA_LECTERNS.put(identifier, block);
    }
}