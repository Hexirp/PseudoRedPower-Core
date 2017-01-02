package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Library;
import com.github.hexirp.forge.Recipe;
import com.github.hexirp.forge.recipe.SmeltingRecipe;
import com.github.hexirp.forge.recipe.SmeltingRecipeExp;
import com.github.hexirp.forge.recipe.SmeltingRecipeInga;

import net.minecraft.init.Items;

/**
 * このクラスは、PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends Library implements Recipe {
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public Smeltings() {
		library.add(
		    new SmeltingRecipe(
		        new SmeltingRecipeInga(
		            Items.carrot,
		            Items.coal),
		        new SmeltingRecipeExp(10, 1)));
	}
}
