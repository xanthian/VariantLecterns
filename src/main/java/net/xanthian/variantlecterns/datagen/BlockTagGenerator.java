package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantlecterns.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> LECTERNS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "lecterns"));
    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_LECTERNS);

        registerTags(AdAstra.AA_LECTERNS);
        registerTags(BeachParty.LDBP_LECTERNS);
        registerTags(BetterArcheology.BA_LECTERNS);
        registerTags(Bewitchment.BW_LECTERNS);
        registerTags(BiomeMakeover.BM_LECTERNS);
        registerTags(Blockus.BLS_LECTERNS);
        registerTags(Botania.BOT_LECTERNS);
        registerTags(Cinderscapes.CS_LECTERNS);
        registerTags(DeeperAndDarker.DAD_LECTERNS);
        registerTags(Desolation.DS_LECTERNS);
        registerTags(EldritchEnd.EE_LECTERNS);
        registerTags(MineCells.MC_LECTERNS);
        registerTags(NaturesSpirit.NS_LECTERNS);
        registerTags(Promenade.PROM_LECTERNS);
        registerTags(RegionsUnexplored.RU_LECTERNS);
        registerTags(SnifferPlus.SP_LECTERNS);
        registerTags(TechReborn.TR_LECTERNS);
        registerTags(Vinery.LDV_LECTERNS);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(LECTERNS);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(LECTERNS);
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(LECTERNS)
                    .addOptional(modifiedId);
        }
    }
}
