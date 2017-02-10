package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.LoadableLibrary;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.prp.core.blocks.SilverOre;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Blocks extends LoadableLibrary {
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		final SilverOre silver_ore = new SilverOre();
		
		GameRegistry.registerBlock(silver_ore, silver_ore.name());
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(silver_ore),
		    0,
		    env.location(silver_ore.name(), "inventory"));
		
		return new Index<MinecraftItem>().put(silver_ore.name(), new MinecraftItem(silver_ore));
	}
}