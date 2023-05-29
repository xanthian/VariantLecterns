package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.xanthian.variantlecterns.block.Lecterns;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Lecterns.ACACIA_LECTERN);
        addDrop(Lecterns.BAMBOO_LECTERN);
        addDrop(Lecterns.CHERRY_LECTERN);
        addDrop(Lecterns.DARK_OAK_LECTERN);
        addDrop(Lecterns.JUNGLE_LECTERN);
        addDrop(Lecterns.MANGROVE_LECTERN);
        addDrop(Lecterns.BIRCH_LECTERN);
        addDrop(Lecterns.SPRUCE_LECTERN);
        addDrop(Lecterns.CRIMSON_LECTERN);
        addDrop(Lecterns.WARPED_LECTERN);
        addDrop(Lecterns.MANGROVE_LECTERN);
    }
}