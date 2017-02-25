package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.recipe.ShapedRecipeOrder;
import hexirp.forge.test.ItemMock;
import hexirp.forge.test.MinecraftItemMock;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public final class ShapedRecipeOrderTest {
	/** 結果の定義. */
	@Test
	public static final void testCalc() {
		assertArrayEquals(
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder().add("ABA"),
		        new ShapedRecipeMaterialMap().put('A', new MinecraftItemMock("sugar")))
		            .array(),
		    new Object[] { "ABA", 'A', new ItemMock("sugar"), });
	}
}
