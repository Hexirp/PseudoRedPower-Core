package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;

import net.minecraft.init.Items;

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
		        .put('A', new MinecraftItem(Items.sugar))
		        .put('B', new MinecraftItem(Items.egg))
		        .put('C', new MinecraftItem(Items.bread)));
		Object[] ret1 = testee.calc();
		
		Object[] ret2 = new Object[] {
		    "ABA",
		    "CCC",
		    'A',
		    new MinecraftItem(Items.sugar),
		    'B',
		    new MinecraftItem(Items.egg),
		    'C',
		    new MinecraftItem(Items.bread)
		};
		
		assertEquals(ret1, ret2);
	}
}
