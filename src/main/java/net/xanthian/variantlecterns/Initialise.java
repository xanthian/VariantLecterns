package net.xanthian.variantlecterns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantlecterns.block.Lecterns;
import net.xanthian.variantlecterns.utils.ModRegistries;
import net.xanthian.variantlecterns.utils.ModPOITypes;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantlecterns";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantlecterns"));

    @Override
    public void onInitialize() {
        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantlecterns.group.variantlecterns"))
                .icon(() -> new ItemStack(Lecterns.MANGROVE_LECTERN))
                .entries((context, entries) -> {
                    entries.add(Lecterns.ACACIA_LECTERN);
                    entries.add(Lecterns.BAMBOO_LECTERN);
                    entries.add(Lecterns.BIRCH_LECTERN);
                    entries.add(Lecterns.CHERRY_LECTERN);
                    entries.add(Lecterns.CRIMSON_LECTERN);
                    entries.add(Lecterns.DARK_OAK_LECTERN);
                    entries.add(Lecterns.JUNGLE_LECTERN);
                    entries.add(Lecterns.MANGROVE_LECTERN);
                    entries.add(Blocks.LECTERN); // Oak
                    entries.add(Lecterns.SPRUCE_LECTERN);
                    entries.add(Lecterns.WARPED_LECTERN);
                })
                .build());

        // Lectern Registration
        Lecterns.registerVanillaLecterns();
        ModRegistries.registerFuelandFlammable();

        // Cleric POI Registration
        ModPOITypes.init();
    }
}