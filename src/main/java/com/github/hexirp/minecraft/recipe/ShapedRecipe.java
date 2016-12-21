package com.github.hexirp.minecraft.recipe;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは定型レシピを表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipe {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの並べ方. */
	private final ShapedRecipeOrder order;
	
	/**
	 * コントストラクタ.
	 *
	 * @param item レシピの結果
	 * @param input レシピの並べ方
	 */
	public ShapedRecipe(RecipeProduct item, ShapedRecipeOrder input) {
		product = item;
		order = input;
	}
	
	/**
	 * 定型レシピを登録する.
	 */
	public final void registry() {
		GameRegistry.addRecipe(product.get(), order.calc());
	}
}
