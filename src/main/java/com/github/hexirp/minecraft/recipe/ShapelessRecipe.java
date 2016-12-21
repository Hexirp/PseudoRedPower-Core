package com.github.hexirp.minecraft.recipe;

import net.minecraft.item.ItemStack;

/**
 * このクラスは不定形のレシピを表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipe {
	/** レシピの結果. */
	private RecipeProduct product;
	
	/** レシピの材料. */
	private ShapelessRecipeMaterial order;
	
	/**
	 * コントストラクタ.
	 *
	 * @param item レシピの結果
	 * @param input レシピの材料
	 */
	public ShapelessRecipe(RecipeProduct item, ShapelessRecipeMaterial input) {
		product = item;
		order = input;
	}
	
	/**
	 * レシピの材料を取得する.
	 */
	public Object[] order() {
		return order.calc();
	}
	
	/**
	 * レシピの結果を取得する.
	 */
	public ItemStack product() {
		return product.get();
	}
}
