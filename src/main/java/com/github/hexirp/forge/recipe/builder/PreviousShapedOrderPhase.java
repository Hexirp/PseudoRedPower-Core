package com.github.hexirp.forge.recipe.builder;

/**
 * {@link ShapedOrderPhase}を前段階とする段階を表現する.
 *
 * @author Hexirp
 */
public class PreviousShapedOrderPhase {
	/** 前段階. */
	final ShapedOrderPhase order;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #order}
	 */
	ShapedOrderPhase order() {
		return order;
	}
	
	/**
	 * Setter.
	 *
	 * @param order {@link #order}
	 */
	PreviousShapedOrderPhase(ShapedOrderPhase order) {
		this.order = order;
	}
}