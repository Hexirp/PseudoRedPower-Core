package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.RecipeProduct;

/**
 * レシピを定義するための補助クラス.
 *
 * @author Hexirp
 */
public class ProductPhase {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/**
	 * Setter.
	 *
	 * @param output 結果
	 * @param size 生成数
	 */
	public ProductPhase(MinecraftItem output, int size) {
		product = new RecipeProduct(output, size);
	}
	
	/**
	 * 並びの定義の段階への移行.
	 *
	 * @return 並びの定義の段階
	 */
	public ShapedOrderPhase order() {
		return new ShapedOrderPhase(product);
	}
	
	/**
	 * 材料の定義の段階への移行.
	 *
	 * @return 並びの定義の段階
	 */
	public ShapelessOrderPhase material() {
		return new ShapelessOrderPhase(product);
	}
}
