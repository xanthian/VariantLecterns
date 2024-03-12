package net.xanthian.variantlecterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;

import java.util.Map;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void offerLecternRecipe(RecipeExporter exporter, ItemConvertible lectern, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, lectern)
                .input('B', Blocks.BOOKSHELF)
                .input('S', slab)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }

    public static void offerLecternWithBookshelfRecipe(RecipeExporter exporter, ItemConvertible lectern, ItemConvertible bookshelf, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, lectern)
                .input('B', bookshelf)
                .input('S', slab)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, VanillaRecipeProvider.getItemPath(lectern) + "_variantbookshelves");
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.ACACIA_LECTERN, Items.ACACIA_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "acacia_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.BAMBOO_LECTERN, Items.BAMBOO_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "bamboo_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.BIRCH_LECTERN, Items.BIRCH_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "birch_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.CHERRY_LECTERN, Items.CHERRY_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "cherry_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.CRIMSON_LECTERN, Items.CRIMSON_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "crimson_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.DARK_OAK_LECTERN, Items.DARK_OAK_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "dark_oak_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.JUNGLE_LECTERN, Items.JUNGLE_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "jungle_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.MANGROVE_LECTERN, Items.MANGROVE_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "mangrove_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.SPRUCE_LECTERN, Items.SPRUCE_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "spruce_bookshelf")));
        offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("variantbookshelves")), Vanilla.WARPED_LECTERN, Items.WARPED_SLAB, Registries.ITEM.get(new Identifier("variantbookshelves", "warped_bookshelf")));

        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.ACACIA_LECTERN, Items.ACACIA_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.BAMBOO_LECTERN, Items.BAMBOO_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.BIRCH_LECTERN, Items.BIRCH_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.CHERRY_LECTERN, Items.CHERRY_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.DARK_OAK_LECTERN, Items.DARK_OAK_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.JUNGLE_LECTERN, Items.JUNGLE_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.MANGROVE_LECTERN, Items.MANGROVE_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.SPRUCE_LECTERN, Items.SPRUCE_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.CRIMSON_LECTERN, Items.CRIMSON_SLAB);
        offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves"))), Vanilla.WARPED_LECTERN, Items.WARPED_SLAB);

        registerLecternRecipe(exporter, AdAstra.AA_LECTERNS, "ad_astra");
        registerLecternRecipe(exporter, BeachParty.LDBP_LECTERNS, "beachparty");
        registerLecternRecipe(exporter, BetterArcheology.BA_LECTERNS, "betterarcheology");
        registerLecternRecipe(exporter, Bewitchment.BW_LECTERNS, "bewitchment");
        registerLecternRecipe(exporter, BiomeMakeover.BM_LECTERNS, "biomemakeover");
        //registerLecternRecipe(exporter, Botania.BOT_LECTERNS, "botania");
        registerLecternRecipe(exporter, Blockus.BLS_LECTERNS, "blockus");
        registerLecternRecipe(exporter, Cinderscapes.CS_LECTERNS, "cinderscapes");
        registerLecternRecipe(exporter, DeeperAndDarker.DAD_LECTERNS, "deeperdarker");
        registerLecternRecipe(exporter, Desolation.DS_LECTERNS, "desolation");
        registerLecternRecipe(exporter, EldritchEnd.EE_LECTERNS, "eldritch_end");
        registerLecternRecipe(exporter, MineCells.MC_LECTERNS, "minecells");
        registerLecternRecipe(exporter, NaturesSpirit.NS_LECTERNS, "natures_spirit");
        registerLecternRecipe(exporter, Promenade.PROM_LECTERNS, "promenade");
        registerLecternRecipe(exporter, RegionsUnexplored.RU_LECTERNS, "regions_unexplored");
        //registerLecternRecipe(exporter, SnifferPlus.SP_LECTERNS, "snifferplus");
        registerLecternRecipe(exporter, TechReborn.TR_LECTERNS, "techreborn");
        registerLecternRecipe(exporter, Vinery.LDV_LECTERNS, "vinery");

        registerLecternWithBookshelfRecipe(exporter, AdAstra.AA_LECTERNS, "ad_astra");
        registerLecternWithBookshelfRecipe(exporter, BeachParty.LDBP_LECTERNS, "beachparty");
        registerLecternWithBookshelfRecipe(exporter, BetterArcheology.BA_LECTERNS, "betterarcheology");
        registerLecternWithBookshelfRecipe(exporter, Bewitchment.BW_LECTERNS, "bewitchment");
        registerLecternWithBookshelfRecipe(exporter, BiomeMakeover.BM_LECTERNS, "biomemakeover");
        //registerLecternWithBookshelfRecipe(exporter, Botania.BOT_LECTERNS, "botania");
        registerLecternWithBookshelfRecipe(exporter, Blockus.BLS_LECTERNS, "blockus");
        registerLecternWithBookshelfRecipe(exporter, Cinderscapes.CS_LECTERNS, "cinderscapes");
        registerLecternWithBookshelfRecipe(exporter, DeeperAndDarker.DAD_LECTERNS, "deeperdarker");
        registerLecternWithBookshelfRecipe(exporter, Desolation.DS_LECTERNS, "desolation");
        registerLecternWithBookshelfRecipe(exporter, EldritchEnd.EE_LECTERNS, "eldritch_end");
        registerLecternWithBookshelfRecipe(exporter, MineCells.MC_LECTERNS, "minecells");
        registerLecternWithBookshelfRecipe(exporter, NaturesSpirit.NS_LECTERNS, "natures_spirit");
        registerLecternWithBookshelfRecipe(exporter, Promenade.PROM_LECTERNS, "promenade");
        registerLecternWithBookshelfRecipe(exporter, RegionsUnexplored.RU_LECTERNS, "regions_unexplored");
        //registerLecternWithBookshelfRecipe(exporter, SnifferPlus.SP_LECTERNS, "snifferplus");
        registerLecternWithBookshelfRecipe(exporter, TechReborn.TR_LECTERNS, "techreborn");
        registerLecternWithBookshelfRecipe(exporter, Vinery.LDV_LECTERNS, "vinery");
    }

    public void registerLecternRecipe(RecipeExporter exporter, Map<Identifier, Block> lecterns, String modId) {
        registerLecternRecipes(exporter, lecterns, modId);
    }

    public void registerLecternRecipes(RecipeExporter exporter, Map<Identifier, Block> lecterns, String modId) {
        for (Map.Entry<Identifier, Block> entry : lecterns.entrySet()) {
            Identifier lecternId = entry.getKey();
            Block lectern = entry.getValue();
            String path = lecternId.getPath();
            String name = path.replace("variantlecterns:", "").replace("_lectern", "").replaceFirst("^[^_]+_", "");
            Identifier slabName = new Identifier(modId + ":" + name + "_slab");
            offerLecternRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                            DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, (slabName)))
                            , DefaultResourceConditions.not(DefaultResourceConditions.allModsLoaded("variantbookshelves")))),
                    lectern, Registries.ITEM.get(slabName));
        }
    }

    public void registerLecternWithBookshelfRecipe(RecipeExporter exporter, Map<Identifier, Block> lectern, String modId) {
        registerLecternWithBookshelfRecipes(exporter, lectern, modId);
    }

    public void registerLecternWithBookshelfRecipes(RecipeExporter exporter, Map<Identifier, Block> lecterns, String modId) {
        for (Map.Entry<Identifier, Block> entry : lecterns.entrySet()) {
            Identifier lecternId = entry.getKey();
            Block lectern = entry.getValue();
            String path = lecternId.getPath();
            String name = path.replace("variantlecterns:", "").replace("_lectern", "").replaceFirst("^[^_]+_", "");
            String name2 = path.replace("variantlecterns:", "").replace("_lectern", "");
            Identifier slabName = new Identifier(modId + ":" + name + "_slab");
            Identifier bookshelfName = new Identifier("variantbookshelves", name2 + "_bookshelf");
            offerLecternWithBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                            DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, (slabName)))
                            , DefaultResourceConditions.allModsLoaded("variantbookshelves"))),
                    lectern, Registries.ITEM.get(slabName), Registries.ITEM.get(bookshelfName));
            System.out.println(name2);
            System.out.println(bookshelfName);
        }
    }
}