package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Lecterns;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantlecterns.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> LECTERNS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"lecterns"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(LECTERNS)
                .add(Lecterns.ACACIA_LECTERN)
                .add(Lecterns.BAMBOO_LECTERN)
                .add(Lecterns.BIRCH_LECTERN)
                .add(Lecterns.CHERRY_LECTERN)
                .add(Lecterns.CRIMSON_LECTERN)
                .add(Lecterns.DARK_OAK_LECTERN)
                .add(Lecterns.JUNGLE_LECTERN)
                .add(Lecterns.MANGROVE_LECTERN)
                .add(Lecterns.SPRUCE_LECTERN)
                .add(Lecterns.WARPED_LECTERN);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(LECTERNS);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(LECTERNS);
    }
}
