package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

import net.minecraft.init.Items;

/**
 * PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends RegisterableLibrary {
	/** 初期化する. */
	@SuppressWarnings("null")
	public Smeltings() {
		library
		    .add(
		        new RecipeBuilder()
		            .inga(
		                new MinecraftItem(Items.carrot),
		                new MinecraftItem(Items.coal))
		            .exp(10, 1)
		            .to());
	}
}