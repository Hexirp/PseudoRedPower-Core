package hexirp.recipe.builder.test;

import org.junit.Test;

import hexirp.builder.test.StackedPhaseLaw;
import hexirp.forge.recipe.builder.RecipeBuilder;
import hexirp.forge.recipe.builder.ShapedMaterialPhase;
import hexirp.forge.recipe.test.MinecraftItemMock;

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
		StackedPhaseLaw.law(
		    new RecipeBuilder()
		        .product(new MinecraftItemMock(""), 0)
		        .order()
		        .to());
	}
}