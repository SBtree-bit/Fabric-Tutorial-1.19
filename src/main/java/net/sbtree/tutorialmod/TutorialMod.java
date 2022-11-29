package net.sbtree.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.sbtree.tutorialmod.block.ModBlocks;
import net.sbtree.tutorialmod.item.ModItemGroup;
import net.sbtree.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
