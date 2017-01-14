package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;

/**
 * {@link ProductPhase}を前段階とする段階の表現
 *
 * @author Hexirp
 */
public class PreviousProductPhase {
	/** 前段階. */
	final ProductPhase product;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #product}
	 */
	RecipeProduct product() {
		return product.product();
	}
	
	/**
	 * Setter.
	 *
	 * @param product {@link #product}
	 */
	PreviousProductPhase(ProductPhase product) {
		this.product = product;
	}
	
}