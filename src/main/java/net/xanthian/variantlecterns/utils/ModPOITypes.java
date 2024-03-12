package net.xanthian.variantlecterns.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantlecterns.block.VariantLecternBlock;
import net.xanthian.variantlecterns.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();
        RegistryEntry<PointOfInterestType> clericEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.LIBRARIAN).get();
        PointOfInterestType clericPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.LIBRARIAN);
        List<BlockState> clericBlockStates = new ArrayList<>(clericPoiType.blockStates);

        for (Block block : Registries.BLOCK) { // Iterate through all blocks
            if (block instanceof VariantLecternBlock lecternBlock) { // Check if the block is an instance of VariantLecternBlock
                ImmutableList<BlockState> blockStates = lecternBlock.getStateManager().getStates();
                for (BlockState blockState : blockStates) {
                    poiStatesToType.putIfAbsent(blockState, clericEntry);
                }
                clericBlockStates.addAll(blockStates);
            }
            clericPoiType.blockStates = ImmutableSet.copyOf(clericBlockStates);
        }
    }
}