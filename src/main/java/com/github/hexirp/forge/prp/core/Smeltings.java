package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Library;
import com.github.hexirp.forge.Recipe;
import com.github.hexirp.forge.smelting.SmeltingRecipe;
import com.github.hexirp.forge.smelting.SmeltingRecipeExp;
import com.github.hexirp.forge.smelting.SmeltingRecipeInga;

import net.minecraft.init.Items;

/**
 * このクラスは、PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends Library implements Recipe {
	@Override
	protected void add() {
		library.add(
		    new SmeltingRecipe(
		        new SmeltingRecipeInga(
		            Items.carrot,
		            Items.coal),
		        new SmeltingRecipeExp(10, 1)));
	}
}
