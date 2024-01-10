package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_LECTERN, "Acacia Lectern");
        translationBuilder.add(Vanilla.BAMBOO_LECTERN, "Bamboo Lectern");
        translationBuilder.add(Vanilla.BIRCH_LECTERN, "Birch Lectern");
        translationBuilder.add(Vanilla.CHERRY_LECTERN, "Cherry Lectern");
        translationBuilder.add(Vanilla.CRIMSON_LECTERN, "Crimson Lectern");
        translationBuilder.add(Vanilla.DARK_OAK_LECTERN, "Dark Oak Lectern");
        translationBuilder.add(Vanilla.JUNGLE_LECTERN, "Jungle Lectern");
        translationBuilder.add(Vanilla.MANGROVE_LECTERN, "Mangrove Lectern");
        translationBuilder.add(Blocks.LECTERN, "Oak Lectern");
        translationBuilder.add(Vanilla.SPRUCE_LECTERN, "Spruce Lectern");
        translationBuilder.add(Vanilla.WARPED_LECTERN, "Warped Lectern");

        registerTranslations(translationBuilder, AdAstra.AA_LECTERNS);
        registerTranslations(translationBuilder, BeachParty.LDBP_LECTERNS);
        registerTranslations(translationBuilder, BetterArcheology.BA_LECTERNS);
        registerTranslations(translationBuilder, Bewitchment.BW_LECTERNS);
        registerTranslations(translationBuilder, BiomeMakeover.BM_LECTERNS);
        registerTranslations(translationBuilder, Blockus.BLS_LECTERNS);
        registerTranslations(translationBuilder, Botania.BOT_LECTERNS);
        registerTranslations(translationBuilder, Cinderscapes.CS_LECTERNS);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_LECTERNS);
        registerTranslations(translationBuilder, Desolation.DS_LECTERNS);
        registerTranslations(translationBuilder, EldritchEnd.EE_LECTERNS);
        registerTranslations(translationBuilder, MineCells.MC_LECTERNS);
        registerTranslations(translationBuilder, NaturesSpirit.NS_LECTERNS);
        registerTranslations(translationBuilder, Promenade.PROM_LECTERNS);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_LECTERNS);
        registerTranslations(translationBuilder, SnifferPlus.SP_LECTERNS);
        registerTranslations(translationBuilder, TechReborn.TR_LECTERNS);
        registerTranslations(translationBuilder, Vinery.LDV_LECTERNS);

    }
}