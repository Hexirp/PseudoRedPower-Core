package com.github.hexirp.recipe.builder.test;

import org.junit.Test;

import com.github.hexirp.builder.test.SimpleTransitionalLaw;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;
import com.github.hexirp.forge.recipe.builder.ShapedOrderPhase;
import com.github.hexirp.forge.recipe.test.MinecraftItemMock;

/**
 * {@link ShapedOrderPhase}のテストを表現する.
 *
 * @author Hexirp
 */
public class ShapedOrderPhaseTest {
	/**
	 * 法則に従っているかテストする.
	 */
	@Test
	public void testLaw() {
		SimpleTransitionalLaw.law(
		    new RecipeBuilder()
		        .product(new MinecraftItemMock(""), 0)
		        .order());
	}
}
