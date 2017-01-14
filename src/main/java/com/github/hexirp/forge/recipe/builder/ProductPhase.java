package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.RecipeProduct;

/**
 * レシピの結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ProductPhase {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #product}
	 */
	RecipeProduct product() {
		return product;
	}
	
	/**
	 * Setter.
	 *
	 * @param output {@link RecipeProduct#output}
	 * @param size {@link RecipeProduct#size}
	 */
	ProductPhase(MinecraftItem output, int size) {
		product = new RecipeProduct(output, size);
	}
	
	/**
	 * 並びの定義の段階に移行する.
	 *
	 * @return {@link ShapedOrderPhase}
	 */
	public ShapedOrderPhase order() {
		return new ShapedOrderPhase(this);
	}
	
	/**
	 * 材料の定義の段階に移行する.
	 *
	 * @return {@link ShapelessOrderPhase}
	 */
	public ShapelessOrderPhase material() {
		return new ShapelessOrderPhase(this);
	}
}
