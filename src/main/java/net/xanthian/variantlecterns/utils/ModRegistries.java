package net.xanthian.variantlecterns.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.xanthian.variantlecterns.block.Lecterns;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        // Copy of Blocks.LECTERN from net.minecraft.block.FireBlock.registerDefaultFlammables
        registry.add(Lecterns.ACACIA_LECTERN, 30, 20);
        registry.add(Lecterns.BAMBOO_LECTERN, 30, 20);
        registry.add(Lecterns.BIRCH_LECTERN, 30, 20);
        registry.add(Lecterns.CHERRY_LECTERN, 30, 20);
        registry.add(Lecterns.DARK_OAK_LECTERN, 30, 20);
        registry.add(Lecterns.JUNGLE_LECTERN, 30, 20);
        registry.add(Lecterns.MANGROVE_LECTERN, 30, 20);
        registry.add(Lecterns.SPRUCE_LECTERN, 30, 20);
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // Copy of Blocks.LECTERN from net.minecraft.block.entity.AbstractFurnaceBlockEntity.createFuelTimeMap
        registry.add(Lecterns.ACACIA_LECTERN, 300);
        registry.add(Lecterns.BAMBOO_LECTERN, 300);
        registry.add(Lecterns.BIRCH_LECTERN, 300);
        registry.add(Lecterns.CHERRY_LECTERN, 300);
        registry.add(Lecterns.DARK_OAK_LECTERN, 300);
        registry.add(Lecterns.JUNGLE_LECTERN, 300);
        registry.add(Lecterns.MANGROVE_LECTERN, 300);
        registry.add(Lecterns.SPRUCE_LECTERN, 300);
    }
}
