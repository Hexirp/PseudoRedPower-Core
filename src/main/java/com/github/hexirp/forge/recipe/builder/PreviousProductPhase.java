package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;

/**
 * {@link ProductPhase}を前段階とする段階を表現する.
 *
 * @author Hexirp
 */
public class PreviousProductPhase {
	/** 前段階. */
	final ProductPhase previous;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #previous}
	 */
	RecipeProduct previous() {
		return previous.product();
	}
	
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	PreviousProductPhase(ProductPhase previous) {
		this.previous = previous;
	}
	
}