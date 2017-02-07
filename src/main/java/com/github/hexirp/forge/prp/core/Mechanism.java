package com.github.hexirp.forge.prp.core;

import com.github.hexirp.annotation.Nullable;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.prp.core.blocks.SilverOre;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * PRP-Coreにより追加されるメカニズム群、つまりアイテムやレシピなどを表現する.
 *
 * @author Hexirp
 */
public class Mechanism {
	/** 銀鉱石. */
	@Nullable
	private static Block silver_ore;
	
	/**
	 * PRP-Coreのメカニズム群を追加する.
	 *
	 * @param env 追加する環境
	 */
	public void add(final Environment env) {
		final Index<MinecraftItem> items = new Items().load(env);
		
		new Recipes(items).register();
		
		silver_ore = new SilverOre();
		GameRegistry.registerBlock(silver_ore, "silver_ore");
		ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(silver_ore),
		    0,
		    env.location("silver_ore", "inventory"));
	}
}