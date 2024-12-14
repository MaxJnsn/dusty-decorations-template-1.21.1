package com.maxjnsn.dustydecorations.item;

import com.maxjnsn.dustydecorations.DustyDecorations;
import com.maxjnsn.dustydecorations.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DustyDecorations.MOD_ID, "dusty_decorations"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dusty_decorations"))
                    .icon(() -> new ItemStack(ModBlocks.APPLE_BARREL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.APPLE_BARREL);
                        entries.add(ModBlocks.BEETROOT_BARREL);
                        entries.add(ModBlocks.CARROT_BARREL);
                        entries.add(ModBlocks.COD_BARREL);
                        entries.add(ModBlocks.GLOW_BERRIES_BARREL);
                        entries.add(ModBlocks.POTATO_BARREL);
                        entries.add(ModBlocks.SALMON_BARREL);
                        entries.add(ModBlocks.SWEET_BERRIES_BARREL);
                        entries.add(ModBlocks.EMPTY_BARREL);

                    }).build());

//    public static final ItemGroup FLUORITE_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(DustyDecorations.MOD_ID, "fluorite_blocks"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fluorite_blocks"))
//                    .icon(() -> new ItemStack(Blocks.SPAWNER)).entries((displayContext, entries) -> {
//                        entries.add(ModBlocks.APPLE_BARREL);
//
//                    }).build());

    public static void registerModItemGroups() {
        DustyDecorations.LOGGER.info("Registering Mod Item Groups for " + DustyDecorations.MOD_ID);
    }

}
