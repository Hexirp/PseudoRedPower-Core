package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.PreviousPhase;

/**
 * {@link ShapedOrderPhase}を前段階とする段階を表現する.
 *
 * @author Hexirp
 */
public class PreviousShapedOrderPhase extends PreviousPhase<ShapedOrderPhase> {
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	PreviousShapedOrderPhase(ShapedOrderPhase previous) {
		super(previous);
	}
}