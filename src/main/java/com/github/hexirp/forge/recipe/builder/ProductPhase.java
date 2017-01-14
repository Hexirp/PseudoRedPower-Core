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
	public RecipeProduct product() {
		return product;
	}
	
	/**
	 * Setter.
	 *
	 * @param output 結果の種類
	 * @param size 結果の数
	 */
	public ProductPhase(MinecraftItem output, int size) {
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
	 * @return {@link ShapelessMaterialPhase}
	 */
	public ShapelessMaterialPhase material() {
		return new ShapelessMaterialPhase(this);
	}
}
