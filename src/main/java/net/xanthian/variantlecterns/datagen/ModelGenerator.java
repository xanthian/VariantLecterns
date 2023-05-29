package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import net.xanthian.variantlecterns.block.Lecterns;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.ACACIA_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.BAMBOO_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.CHERRY_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.DARK_OAK_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.JUNGLE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.MANGROVE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.BIRCH_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.SPRUCE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.CRIMSON_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.WARPED_LECTERN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}