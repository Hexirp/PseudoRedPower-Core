package com.github.hexirp.minecraft.recipe;

import net.minecraft.item.ItemStack;

/**
 * このクラスは定型レシピを表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipe {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの結果を取得する. */
	public ItemStack getProduct() {
		return product.get();
	}
	
	/** レシピの並べ方. */
	private final ShapedRecipeOrder order;
	
	/** レシピの並べ方を取得する. */
	public Object[] calcOrder() {
		return order.calc();
	}
	
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
}
