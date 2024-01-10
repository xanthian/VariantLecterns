package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Block block : Vanilla.VANILLA_LECTERNS.values()) {
            addDrop(block);
        }

        registerLootTables(AdAstra.AA_LECTERNS, "ad_astra");
        registerLootTables(BeachParty.LDBP_LECTERNS, "beachparty");
        registerLootTables(BetterArcheology.BA_LECTERNS, "betterarcheology");
        registerLootTables(Bewitchment.BW_LECTERNS, "bewitchment");
        registerLootTables(BiomeMakeover.BM_LECTERNS, "biomemakeover");
        registerLootTables(Blockus.BLS_LECTERNS, "blockus");
        registerLootTables(Botania.BOT_LECTERNS, "botania");
        registerLootTables(Cinderscapes.CS_LECTERNS, "cinderscape");
        registerLootTables(DeeperAndDarker.DAD_LECTERNS, "deeperdarker");
        registerLootTables(Desolation.DS_LECTERNS, "desolation");
        registerLootTables(EldritchEnd.EE_LECTERNS, "eldritch_end");
        registerLootTables(MineCells.MC_LECTERNS, "minecells");
        registerLootTables(NaturesSpirit.NS_LECTERNS, "natures_spirit");
        registerLootTables(Promenade.PROM_LECTERNS, "promenade");
        registerLootTables(RegionsUnexplored.RU_LECTERNS, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_LECTERNS, "snifferplus");
        registerLootTables(TechReborn.TR_LECTERNS, "techreborn");
        registerLootTables(Vinery.LDV_LECTERNS, "vinery");
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block block : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(block);
        }
    }
}