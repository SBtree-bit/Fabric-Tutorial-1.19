package net.sbtree.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.sbtree.tutorialmod.block.ModBlocks;
import net.sbtree.tutorialmod.item.ModItems;
import net.sbtree.tutorialmod.painting.ModPaintings;
import net.sbtree.tutorialmod.util.ModLootTableModifiers;
import net.sbtree.tutorialmod.villager.ModVillagers;
import net.sbtree.tutorialmod.world.feature.ModConfiguredFeatures;
import net.sbtree.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();
		ModLootTableModifiers.modifyLootTalbes();
	}
}
