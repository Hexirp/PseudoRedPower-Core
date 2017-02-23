package hexirp.recipe.builder.test;

import org.junit.Test;

import hexirp.builder.test.SimpleTransitionalLaw;
import hexirp.forge.recipe.builder.RecipeBuilder;
import hexirp.forge.recipe.builder.ShapedOrderPhase;
import hexirp.forge.test.MinecraftItemMock;

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
