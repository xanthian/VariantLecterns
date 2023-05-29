package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantlecterns.block.Lecterns;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.ACACIA_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.ACACIA_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.ACACIA_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.BAMBOO_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.BAMBOO_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.BAMBOO_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.BIRCH_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.BIRCH_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.BIRCH_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.CHERRY_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.CHERRY_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.CHERRY_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.DARK_OAK_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.DARK_OAK_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.DARK_OAK_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.JUNGLE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.JUNGLE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.JUNGLE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.MANGROVE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.MANGROVE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.MANGROVE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.SPRUCE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.SPRUCE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.SPRUCE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.CRIMSON_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.CRIMSON_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.CRIMSON_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.WARPED_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.WARPED_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.WARPED_LECTERN)));
    }
}