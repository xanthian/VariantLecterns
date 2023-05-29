package net.xanthian.variantlecterns.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;

import net.xanthian.variantlecterns.block.Lecterns;
import net.xanthian.variantlecterns.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> clericEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.CLERIC).get();

        PointOfInterestType clericPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.CLERIC);

        // NOTE: PointOfInterestType.blockStates is accessible by access widener
        List<BlockState> clericBlockStates = new ArrayList<BlockState>(clericPoiType.blockStates);

        for (Block block : Lecterns.MOD_LECTERNS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, clericEntry);
            }

            clericBlockStates.addAll(blockStates);
        }

        // NOTE: PointOfInterestType.blockStates is mutable by access widener
        clericPoiType.blockStates = ImmutableSet.copyOf(clericBlockStates);
    }
}