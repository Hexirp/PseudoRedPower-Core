package com.github.hexirp.forge.recipe.builder;

/**
 * {@link ProductPhase}を前段階とする段階を表現する.
 *
 * @author Hexirp
 */
public class PreviousProductPhase extends PreviousPhase<ProductPhase> {
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	PreviousProductPhase(ProductPhase previous) {
		super(previous);
	}
}