package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.recipe.ShapedRecipeOrder;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeOrderTest {
	/**
	 * 結果の定義.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc() {
		assertEquals(
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder().add("ABA"),
		        new ShapedRecipeMaterialMap().put('A', new MinecraftItemMock("sugar")))
		            .array(),
		    new Object[] { "ABA", 'A', new ItemMock("sugar"), });
	}
}