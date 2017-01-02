package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.Recipe;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは不定形のレシピを表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipe implements Recipe {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの材料. */
	private final ShapelessRecipeMaterial order;
	
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
	
	@Override
	public void register() {
		GameRegistry.addShapelessRecipe(product.get(), order.calc());
	}
}
