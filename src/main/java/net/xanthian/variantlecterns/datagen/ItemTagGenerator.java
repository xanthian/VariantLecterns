package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Lecterns;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantlecterns.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> LECTERNS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"lecterns"));
        private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
        private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(LECTERNS)
                    .add(Item.fromBlock(Lecterns.ACACIA_LECTERN))
                    .add(Item.fromBlock(Lecterns.BAMBOO_LECTERN))
                    .add(Item.fromBlock(Lecterns.BIRCH_LECTERN))
                    .add(Item.fromBlock(Lecterns.CHERRY_LECTERN))
                    .add(Item.fromBlock(Lecterns.CRIMSON_LECTERN))
                    .add(Item.fromBlock(Lecterns.DARK_OAK_LECTERN))
                    .add(Item.fromBlock(Lecterns.JUNGLE_LECTERN))
                    .add(Item.fromBlock(Lecterns.MANGROVE_LECTERN))
                    .add(Item.fromBlock(Lecterns.SPRUCE_LECTERN))
                    .add(Item.fromBlock(Lecterns.WARPED_LECTERN));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Item.fromBlock(Lecterns.CRIMSON_LECTERN))
                    .add(Item.fromBlock(Lecterns.WARPED_LECTERN));

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(LECTERNS);
        }
    }