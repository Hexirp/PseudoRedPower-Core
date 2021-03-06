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
	public final void testCalc() {
		assertArrayEquals(
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder().add("AAA"),
		        new ShapedRecipeMaterialMap().put('A', new MinecraftItemMock(new ItemMock("sugar")))).array(),
		    new Object[] { "AAA", 'A', new ItemMock("sugar"), });
	}
}
