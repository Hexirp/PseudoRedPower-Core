package com.github.hexirp.minecraft.recipe;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスはレシピを登録するクラスのWrapperである.
 *
 * @author Hexirp
 */
public class RecipeRegistration {
	/**
	 * 定型レシピを登録する.
	 *
	 * @param recipe 登録されるレシピ
	 */
	public static final void addShapedRecipe(ShapedRecipe recipe) {
		GameRegistry.addRecipe(recipe.getProduct(), recipe.calcOrder());
	}

	/**
	 * 不定形レシピを登録する.
	 *
	 * @param recipe 登録されるレシピ
	 */
	public static final void addShapelessRecipe(ShapelessRecipe recipe) {
		GameRegistry.addShapelessRecipe(recipe.product(), recipe.order());
	}
}
