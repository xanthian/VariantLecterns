package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;
import net.xanthian.variantlecterns.utils.ModItemTags;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantlecterns.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    private static final TagKey<Item> LECTERNS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "lecterns"));
    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
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

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Vanilla.CRIMSON_LECTERN.asItem())
                .add(Vanilla.WARPED_LECTERN.asItem())
                .addOptional(new Identifier("variantlecterns:bls_charred_lectern"))
                .addOptional(new Identifier("variantlecterns:prom_dark_amaranth_lectern"))
                .addOptional(new Identifier("variantlecterns:ru_brimwood_lectern"))
                .addOptional(new Identifier("variantlecterns:ru_cobalt_lectern"))
                .addOptional(new Identifier("variantlecterns:ru_dead_lectern"))
                .addOptional(new Identifier("variantlecterns:ru_yellow_bioshroom_lectern"));

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(LECTERNS);
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(ModItemTags.LECTERNS)
                    .addOptional(modifiedId);
        }
    }
}