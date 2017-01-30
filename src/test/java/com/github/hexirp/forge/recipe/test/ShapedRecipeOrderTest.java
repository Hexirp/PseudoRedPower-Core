package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;

/**
 * @author Hexirp
 * @see com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeOrderTest {
	/**
	 * 結果の定義.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc() {
		Object[] ret1 = new ShapedRecipeOrder(
		    new ShapedRecipeAbstractOrder()
		        .add("ABA")
		        .add("CCC"),
		    new ShapedRecipeMaterialMap()
		        .put('A', new MinecraftItemMock("sugar"))
		        .put('B', new MinecraftItemMock("egg"))
		        .put('C', new MinecraftItemMock("bread"))).calc();
		
		Object[] ret2 = new Object[] {
		    "ABA",
		    "CCC",
		    'A',
		    new ItemMock("sugar"),
		    'B',
		    new ItemMock("egg"),
		    'C',
		    new ItemMock("bread")
		};
		
		assertEquals(ret1, ret2);
	}
}
