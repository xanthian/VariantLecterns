package net.xanthian.variantlecterns.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Vanilla.ACACIA_LECTERN, 30, 20);
        registry.add(Vanilla.BAMBOO_LECTERN, 30, 20);
        registry.add(Vanilla.BIRCH_LECTERN, 30, 20);
        registry.add(Vanilla.CHERRY_LECTERN, 30, 20);
        registry.add(Vanilla.DARK_OAK_LECTERN, 30, 20);
        registry.add(Vanilla.JUNGLE_LECTERN, 30, 20);
        registry.add(Vanilla.MANGROVE_LECTERN, 30, 20);
        registry.add(Vanilla.SPRUCE_LECTERN, 30, 20);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_LECTERN, 30, 20);
            registry.add(Blockus.BLS_WHITE_OAK_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            for (Block block : Botania.BOT_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("desolation")) {
            registry.add(Desolation.DS_CHARRED_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_LECTERNS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_LECTERN, 30, 20);
            registry.add(Promenade.PROM_PALM_LECTERN, 30, 20);
            registry.add(Promenade.PROM_SAKURA_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BAOBAB_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_CYPRESS_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_JOSHUA_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_KAPOK_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_LARCH_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_MAPLE_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_MAUVE_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_PALM_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_PINE_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_REDWOOD_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_SOCOTRA_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_WILLOW_LECTERN, 30, 20);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_LECTERN, 30, 20);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_LECTERN, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_LECTERN, 30, 20);
        }
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_LECTERN, 300);
        registry.add(Vanilla.BAMBOO_LECTERN, 300);
        registry.add(Vanilla.BIRCH_LECTERN, 300);
        registry.add(Vanilla.CHERRY_LECTERN, 300);
        registry.add(Vanilla.DARK_OAK_LECTERN, 300);
        registry.add(Vanilla.JUNGLE_LECTERN, 300);
        registry.add(Vanilla.MANGROVE_LECTERN, 300);
        registry.add(Vanilla.SPRUCE_LECTERN, 300);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_LECTERN, 300);
            registry.add(Blockus.BLS_WHITE_OAK_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            for (Block block : Botania.BOT_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("desolation")) {
            registry.add(Desolation.DS_CHARRED_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_LECTERNS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_LECTERN, 300);
            registry.add(Promenade.PROM_PALM_LECTERN, 300);
            registry.add(Promenade.PROM_SAKURA_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_KAPOK_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_LARCH_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_PALM_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_PINE_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_SOCOTRA_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_LECTERN, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_LECTERN, 300);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_LECTERN, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_LECTERN, 300);
        }
    }
}
