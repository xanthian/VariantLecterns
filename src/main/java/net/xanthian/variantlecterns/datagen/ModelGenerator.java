package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;
import net.xanthian.variantlecterns.utils.ModModel;
import net.xanthian.variantlecterns.utils.ModTextureKey;
import net.xanthian.variantlecterns.utils.ModTextureMap;

import java.util.Map;
import java.util.function.Function;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void createLectern(BlockStateModelGenerator blockStateModelGenerator, Block block, String plank) {
        TextureMap textureMap = ModTextureMap.lectern(block, plank);
        ModModel.LECTERN.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
    }

    public static void registerVanillaLectern(BlockStateModelGenerator blockStateModelGenerator, Block block, Block plank) {
        TextureMap textureMap = TextureMap.of(TextureKey.TOP, TextureMap.getSubId(block, "_top")).put(TextureKey.BOTTOM, TextureMap.getId(plank)).put(ModTextureKey.BASE, TextureMap.getSubId(block, "_base")).put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_sides")).put(TextureKey.FRONT, TextureMap.getSubId(block, "_front")).put(ModTextureKey.SIDES, TextureMap.getSubId(block, "_sides"));
        ModModel.LECTERN.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
    }

    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap, String modId, Function<String, String> modelPathGenerator) {
        for (Block block : blockMap.values()) {
            String blockName = block.getTranslationKey();
            int firstUnderscoreIndex = blockName.indexOf('_');
            if (firstUnderscoreIndex != -1) {
                String plankName = blockName.substring(firstUnderscoreIndex + 1, blockName.lastIndexOf("_lectern"));
                String modelPath = modId + ":block/" + modelPathGenerator.apply(plankName);
                createLectern(blockStateModelGenerator, block, modelPath);
            } else {
                System.out.println("Invalid block name format: " + blockName);
            }
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        registerVanillaLectern(blockStateModelGenerator, Vanilla.ACACIA_LECTERN, Blocks.ACACIA_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.BAMBOO_LECTERN, Blocks.BAMBOO_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.BIRCH_LECTERN, Blocks.BIRCH_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.CHERRY_LECTERN, Blocks.CHERRY_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.CRIMSON_LECTERN, Blocks.CRIMSON_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.DARK_OAK_LECTERN, Blocks.DARK_OAK_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.JUNGLE_LECTERN, Blocks.JUNGLE_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.MANGROVE_LECTERN, Blocks.MANGROVE_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.SPRUCE_LECTERN, Blocks.SPRUCE_PLANKS);
        registerVanillaLectern(blockStateModelGenerator, Vanilla.WARPED_LECTERN, Blocks.WARPED_PLANKS);

        registerModel(blockStateModelGenerator, AdAstra.AA_LECTERNS, "ad_astra", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BeachParty.LDBP_LECTERNS, "beachparty", plankName -> plankName + "_planks0");
        registerModel(blockStateModelGenerator, BetterArcheology.BA_LECTERNS, "betterarcheology", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Bewitchment.BW_LECTERNS, "bewitchment", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_LECTERNS, "biomemakeover", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Blockus.BLS_LECTERNS, "blockus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Botania.BOT_LECTERNS, "botania", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Cinderscapes.CS_LECTERNS, "cinderscapes", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_LECTERNS, "deeperdarker", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Desolation.DS_LECTERNS, "desolation", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, EldritchEnd.EE_LECTERNS, "eldritch_end", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, MineCells.MC_LECTERNS, "minecells", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_LECTERNS, "natures_spirit", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Promenade.PROM_LECTERNS, "promenade", plankName -> plankName + "/planks");
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_LECTERNS, "regions_unexplored", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, SnifferPlus.SP_LECTERNS, "snifferplus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, TechReborn.TR_LECTERNS, "techreborn", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Vinery.LDV_LECTERNS, "vinery", plankName -> plankName + "_planks");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}