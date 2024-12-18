package com.maxjnsn.dustydecorations;

import com.maxjnsn.dustydecorations.blocks.ModBlocks;
import com.maxjnsn.dustydecorations.item.ModItemGroups;
import com.maxjnsn.dustydecorations.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DustyDecorations implements ModInitializer {
	public static final String MOD_ID = "dusty-decorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}