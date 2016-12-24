package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.Registerable;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは不定形のレシピを表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipe implements Registerable {
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
	
	@Override
	public final void register() {
		GameRegistry.addShapelessRecipe(product.get(), order.calc());
	}
}
