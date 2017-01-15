package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

import net.minecraft.init.Items;

/**
 * チェーンメイルを作成するためのレシピを定義する.
 *
 * @author Hexirp
 */
public class ChainMail extends RegisterableLibrary {
	@Override
	protected void add() {
		library
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Items.chainmail_helmet), 1)
		            .order()
		            .add(" A ")
		            .add("A A")
		            .map()
		            .put('A', new MinecraftItem(Items.iron_ingot))
		            .to())
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Items.chainmail_chestplate), 1)
		            .order()
		            .add("A A")
		            .add(" A ")
		            .add("AAA")
		            .map()
		            .put('A', new MinecraftItem(Items.iron_ingot))
		            .to())
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Items.chainmail_leggings), 1)
		            .order()
		            .add(" A ")
		            .add("A A")
		            .add("A A")
		            .map()
		            .put('A', new MinecraftItem(Items.iron_ingot))
		            .to())
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Items.chainmail_boots), 1)
		            .order()
		            .add("A  ")
		            .add("  A")
		            .map()
		            .put('A', new MinecraftItem(Items.iron_ingot))
		            .to());
	}
}
