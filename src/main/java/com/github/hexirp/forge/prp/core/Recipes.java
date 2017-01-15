package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.prp.core.recipes.ChainMail;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

import net.minecraft.init.Blocks;

/**
 * PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes extends RegisterableLibrary {
	@Override
	protected void add() {
		library
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Blocks.bedrock), 1)
		            .order()
		            .add("AAA")
		            .add("AAA")
		            .add("AAA")
		            .map()
		            .put('A', new MinecraftItem(Blocks.bedrock))
		            .to())
		    .add(new ChainMail())
		    .add(new Smeltings());
	}
}
