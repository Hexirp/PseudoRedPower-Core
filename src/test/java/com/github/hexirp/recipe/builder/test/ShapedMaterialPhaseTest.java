package com.github.hexirp.recipe.builder.test;

import org.junit.Test;

import com.github.hexirp.builder.test.StackedPhaseLaw;
import com.github.hexirp.forge.recipe.builder.ShapedMaterialPhase;
import com.github.hexirp.forge.recipe.builder.ShapedOrderPhase;

/**
 * {@link ShapedMaterialPhase}のテストを表現する.
 *
 * @author Hexirp
 */
public class ShapedMaterialPhaseTest {
	/**
	 * 法則に従っているかテストする.
	 */
	@Test
	public void testLaw() {
		StackedPhaseLaw.law(new ShapedMaterialPhase(new ShapedOrderPhase(null)));
	}
}
