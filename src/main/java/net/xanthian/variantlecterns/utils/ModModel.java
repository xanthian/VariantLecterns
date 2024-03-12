package net.xanthian.variantlecterns.utils;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModel {

    public static final Model LECTERN;

    static {
        LECTERN = createModel("variantlectern", ModTextureKey.BASE, TextureKey.BOTTOM, ModTextureKey.SIDES, TextureKey.FRONT, TextureKey.TOP, TextureKey.PARTICLE);
    }

    public static Identifier getBlockId(String id) {
        return new Identifier("variantlecterns", "block/" + id);
    }

    public static Model createModel(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(getBlockId(parent)), Optional.empty(), requiredTextures);
    }
}