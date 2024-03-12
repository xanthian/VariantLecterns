package net.xanthian.variantlecterns.utils;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class ModTextureMap extends TextureMap {

    public static TextureMap lectern(Block block, String plank) {
        return (new ModTextureMap())
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.BOTTOM, new Identifier(plank))
                .put(ModTextureKey.BASE, TextureMap.getSubId(block, "_base"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_sides"))
                .put(TextureKey.FRONT, TextureMap.getSubId(block, "_front"))
                .put(ModTextureKey.SIDES, TextureMap.getSubId(block, "_sides"));
    }
}