package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

/**
 * PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムのリスト
	 */
	public Smeltings(final Index<MinecraftItem> items) {
		add(
		    new RecipeBuilder()
		        .inga(items.get("silver_ingot"), items.get("silver_ore"))
		        .exp(1, 1)
		        .to());
	}
}