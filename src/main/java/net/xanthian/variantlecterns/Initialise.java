package net.xanthian.variantlecterns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantlecterns.block.Vanilla;
import net.xanthian.variantlecterns.block.compatability.*;
import net.xanthian.variantlecterns.utils.ModCreativeTab;
import net.xanthian.variantlecterns.utils.ModPOITypes;
import net.xanthian.variantlecterns.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantlecterns";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaLecterns();

        ifModLoaded("ad_astra", AdAstra::registerLecterns);

        ifModLoaded("beachparty", BeachParty::registerLecterns);

        ifModLoaded("betterarcheology", BetterArcheology::registerLecterns);

        ifModLoaded("bewitchment", Bewitchment::registerLecterns);

        ifModLoaded("biomemakeover", BiomeMakeover::registerLecterns);

        ifModLoaded("blockus", Blockus::registerLecterns);

        ifModLoaded("botania", Botania::registerLecterns);

        ifModLoaded("cinderscapes", Cinderscapes::registerLecterns);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerLecterns);

        ifModLoaded("desolation", Desolation::registerLecterns);

        ifModLoaded("eldritch_end", EldritchEnd::registerLecterns);

        ifModLoaded("minecells", MineCells::registerLecterns);

        ifModLoaded("natures_spirit", NaturesSpirit::registerLecterns);

        ifModLoaded("promenade", Promenade::registerLecterns);

        ifModLoaded("regions_unexplored", RegionsUnexplored::registerLecterns);

        ifModLoaded("snifferplus", SnifferPlus::registerLecterns);

        ifModLoaded("techreborn", TechReborn::registerLecterns);

        ifModLoaded("vinery", Vinery::registerLecterns);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
        ModPOITypes.init();

        //Datagen Block - disable for client run
        SnifferPlus.registerLecterns();
        Botania.registerLecterns();
    }
}