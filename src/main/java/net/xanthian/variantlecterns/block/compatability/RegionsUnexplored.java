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

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_LECTERNS = Maps.newHashMap();

    public static Block RU_ALPHA_LECTERN;
    public static Block RU_BAOBAB_LECTERN;
    public static Block RU_BLACK_PAINTED_LECTERN;
    public static Block RU_BLACKWOOD_LECTERN;
    public static Block RU_BLUE_BIOSHROOM_LECTERN;
    public static Block RU_BLUE_PAINTED_LECTERN;
    public static Block RU_BRIMWOOD_LECTERN;
    public static Block RU_BROWN_PAINTED_LECTERN;
    public static Block RU_COBALT_LECTERN;
    public static Block RU_CYAN_PAINTED_LECTERN;
    public static Block RU_CYPRESS_LECTERN;
    public static Block RU_DEAD_LECTERN;
    public static Block RU_EUCALYPTUS_LECTERN;
    public static Block RU_GRAY_PAINTED_LECTERN;
    public static Block RU_GREEN_BIOSHROOM_LECTERN;
    public static Block RU_GREEN_PAINTED_LECTERN;
    public static Block RU_JOSHUA_LECTERN;
    public static Block RU_KAPOK_LECTERN;
    public static Block RU_LARCH_LECTERN;
    public static Block RU_LIGHT_BLUE_PAINTED_LECTERN;
    public static Block RU_LIGHT_GRAY_PAINTED_LECTERN;
    public static Block RU_LIME_PAINTED_LECTERN;
    public static Block RU_MAGENTA_PAINTED_LECTERN;
    public static Block RU_MAGNOLIA_LECTERN;
    public static Block RU_MAPLE_LECTERN;
    public static Block RU_MAUVE_LECTERN;
    public static Block RU_ORANGE_PAINTED_LECTERN;
    public static Block RU_PALM_LECTERN;
    public static Block RU_PINE_LECTERN;
    public static Block RU_PINK_BIOSHROOM_LECTERN;
    public static Block RU_PINK_PAINTED_LECTERN;
    public static Block RU_PURPLE_PAINTED_LECTERN;
    public static Block RU_REDWOOD_LECTERN;
    public static Block RU_RED_PAINTED_LECTERN;
    public static Block RU_SOCOTRA_LECTERN;
    public static Block RU_WHITE_PAINTED_LECTERN;
    public static Block RU_WILLOW_LECTERN;
    public static Block RU_YELLOW_BIOSHROOM_LECTERN;
    public static Block RU_YELLOW_PAINTED_LECTERN;

    public static void registerLecterns() {
        RU_ALPHA_LECTERN = registerLectern("ru_alpha_lectern");
        RU_BAOBAB_LECTERN = registerLectern("ru_baobab_lectern");
        RU_BLACK_PAINTED_LECTERN = registerLectern("ru_black_painted_lectern");
        RU_BLACKWOOD_LECTERN = registerLectern("ru_blackwood_lectern");
        RU_BLUE_BIOSHROOM_LECTERN = registerLectern("ru_blue_bioshroom_lectern");
        RU_BLUE_PAINTED_LECTERN = registerLectern("ru_blue_painted_lectern");
        RU_BRIMWOOD_LECTERN = registerLectern("ru_brimwood_lectern");
        RU_BROWN_PAINTED_LECTERN = registerLectern("ru_brown_painted_lectern");
        RU_COBALT_LECTERN = registerLectern("ru_cobalt_lectern");
        RU_CYAN_PAINTED_LECTERN = registerLectern("ru_cyan_painted_lectern");
        RU_CYPRESS_LECTERN = registerLectern("ru_cypress_lectern");
        RU_DEAD_LECTERN = registerLectern("ru_dead_lectern");
        RU_EUCALYPTUS_LECTERN = registerLectern("ru_eucalyptus_lectern");
        RU_GREEN_BIOSHROOM_LECTERN = registerLectern("ru_green_bioshroom_lectern");
        RU_GREEN_PAINTED_LECTERN = registerLectern("ru_green_painted_lectern");
        RU_GRAY_PAINTED_LECTERN = registerLectern("ru_gray_painted_lectern");
        RU_JOSHUA_LECTERN = registerLectern("ru_joshua_lectern");
        RU_KAPOK_LECTERN = registerLectern("ru_kapok_lectern");
        RU_LARCH_LECTERN = registerLectern("ru_larch_lectern");
        RU_LIGHT_BLUE_PAINTED_LECTERN = registerLectern("ru_light_blue_painted_lectern");
        RU_LIGHT_GRAY_PAINTED_LECTERN = registerLectern("ru_light_gray_painted_lectern");
        RU_LIME_PAINTED_LECTERN = registerLectern("ru_lime_painted_lectern");
        RU_MAGENTA_PAINTED_LECTERN = registerLectern("ru_magenta_painted_lectern");
        RU_MAGNOLIA_LECTERN = registerLectern("ru_magnolia_lectern");
        RU_MAPLE_LECTERN = registerLectern("ru_maple_lectern");
        RU_MAUVE_LECTERN = registerLectern("ru_mauve_lectern");
        RU_ORANGE_PAINTED_LECTERN = registerLectern("ru_orange_painted_lectern");
        RU_PALM_LECTERN = registerLectern("ru_palm_lectern");
        RU_PINE_LECTERN = registerLectern("ru_pine_lectern");
        RU_PINK_BIOSHROOM_LECTERN = registerLectern("ru_pink_bioshroom_lectern");
        RU_PINK_PAINTED_LECTERN = registerLectern("ru_pink_painted_lectern");
        RU_PURPLE_PAINTED_LECTERN = registerLectern("ru_purple_painted_lectern");
        RU_RED_PAINTED_LECTERN = registerLectern("ru_red_painted_lectern");
        RU_REDWOOD_LECTERN = registerLectern("ru_redwood_lectern");
        RU_SOCOTRA_LECTERN = registerLectern("ru_socotra_lectern");
        RU_WHITE_PAINTED_LECTERN = registerLectern("ru_white_painted_lectern");
        RU_WILLOW_LECTERN = registerLectern("ru_willow_lectern");
        RU_YELLOW_BIOSHROOM_LECTERN = registerLectern("ru_yellow_bioshroom_lectern");
        RU_YELLOW_PAINTED_LECTERN = registerLectern("ru_yellow_painted_lectern");

    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        RU_LECTERNS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerLectern(String name) {
        return register(name, new VariantLecternBlock());
    }
}