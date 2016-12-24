package com.github.hexirp.minecraft.recipe;

import com.github.hexirp.minecraft.Registerable;

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
	public final void registry() {
		GameRegistry.addShapelessRecipe(product.get(), order.calc());
	}
}
