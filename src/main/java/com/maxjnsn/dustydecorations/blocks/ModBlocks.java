package com.maxjnsn.dustydecorations.blocks;

import com.maxjnsn.dustydecorations.DustyDecorations;
import com.maxjnsn.dustydecorations.blocks.custom.CustomEmptyBarrelBlock;
import com.maxjnsn.dustydecorations.blocks.custom.CustomFilledBarrelBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block APPLE_BARREL = registerBlock("apple_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block BEETROOT_BARREL = registerBlock("beetroot_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block CARROT_BARREL = registerBlock("carrot_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block COD_BARREL = registerBlock("cod_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block GLOW_BERRIES_BARREL = registerBlock("glow_berries_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block POTATO_BARREL = registerBlock("potato_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block SALMON_BARREL = registerBlock("salmon_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block SWEET_BERRIES_BARREL = registerBlock("sweet_berries_barrel",
            new CustomFilledBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    public static final Block EMPTY_BARREL = registerBlock("empty_barrel",
            new CustomEmptyBarrelBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.5f)
                    .nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DustyDecorations.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DustyDecorations.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DustyDecorations.LOGGER.info("Registering Mod Blocks for " + DustyDecorations.MOD_ID);
    }
}
