package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.smelting.SmeltingRecipe;
import com.github.hexirp.forge.smelting.SmeltingRecipeExp;
import com.github.hexirp.forge.smelting.SmeltingRecipeInga;

import net.minecraft.init.Items;

/**
 * このクラスは、PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends RegisterableLibrary {
	@Override
	protected void add() {
		new SmeltingRecipe(
		    new SmeltingRecipeInga(
		        Items.carrot,
		        Items.coal),
		    new SmeltingRecipeExp(10, 1))
		        .add(library);
	}
}
