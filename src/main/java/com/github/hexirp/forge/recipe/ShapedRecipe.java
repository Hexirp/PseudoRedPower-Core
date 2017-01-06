package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.Registerable;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは定型レシピを表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipe implements Registerable {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの並べ方. */
	private final ShapedRecipeOrder order;
	
	/**
	 * Setter.
	 *
	 * @param item レシピの結果
	 * @param input レシピの並べ方
	 */
	public ShapedRecipe(RecipeProduct item, ShapedRecipeOrder input) {
		product = item;
		order = input;
	}
	
	@Override
	public final void register() {
		GameRegistry.addRecipe(product.get(), order.calc());
	}
}
