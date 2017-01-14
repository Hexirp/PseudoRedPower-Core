package com.github.hexirp.forge.recipe.builder;

/**
 * {@link ShapedOrderPhase}を前段階とする段階を表現する.
 *
 * @author Hexirp
 */
public class PreviousShapedOrderPhase {
	/** 前段階. */
	final ShapedOrderPhase previous;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #previous}
	 */
	ShapedOrderPhase previous() {
		return previous;
	}
	
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	PreviousShapedOrderPhase(ShapedOrderPhase previous) {
		this.previous = previous;
	}
}