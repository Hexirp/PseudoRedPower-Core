package com.github.hexirp.minecraft.recipe.test;

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
		ShapedRecipeOrder testee = new ShapedRecipeOrder(
		    new ShapedRecipeAbstractOrder()
		        .add("ABA")
		        .add("CCC"),
		    new ShapedRecipeMaterialMap()
		        .put('A', "suger")
		        .put('B', "egg")
		        .put('C', "bread"));
		Object[] ret1 = testee.calc();
		
		Object[] ret2 = new Object[] {
		    "ABA",
		    "CCC",
		    'A',
		    "suger",
		    'B',
		    "egg",
		    'C',
		    "bread"
		};
		
		assertEquals(ret1, ret2);
	}
	
}
