package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * @author Hexirp
 * @see com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder
 */
public class ShapedRecipeAbstractOrderTest {
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void testShapedRecipeAbstractOrder() {
		assertEquals(new ShapedRecipeAbstractOrder().order(), new ShapedRecipeAbstractOrder().order());
	}
	
	/**
	 * コントストラクタで生成される内容は空のリストである.
	 */
	@Test
	public void testOrder() {
		List<String> ret1 = new ShapedRecipeAbstractOrder().order();
		List<String> ret2 = new LinkedList<>();
		
		assertEquals(ret1, ret2);
	}
	
	/**
	 * addは内部のリストに値を追加する.
	 */
	@Test
	public void testAdd() {
		List<String> ret1 = new ShapedRecipeAbstractOrder()
		    .add("AAA")
		    .add("BBB")
		    .add("CCC")
		    .order();
		
		List<String> ret2 = new LinkedList<>();
		ret2.add("AAA");
		ret2.add("BBB");
		ret2.add("CCC");
		
		assertEquals(ret1, ret2);
	}
}
