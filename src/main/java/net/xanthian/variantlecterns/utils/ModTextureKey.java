package net.xanthian.variantlecterns.utils;

import net.minecraft.data.client.TextureKey;

public class ModTextureKey {

    public static final TextureKey SIDES;
    public static final TextureKey BASE;

    static {
        SIDES = TextureKey.of("sides");
        BASE = TextureKey.of("base");
    }
}