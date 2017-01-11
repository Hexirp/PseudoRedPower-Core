package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;

/**
 * @author Hexirp
 * @see com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeMaterialMapTest {
	
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void testShapedRecipeMaterialMap() {
		ShapedRecipeMaterialMap testee1 = new ShapedRecipeMaterialMap();
		ShapedRecipeMaterialMap testee2 = new ShapedRecipeMaterialMap();
		
		assertEquals(testee1.toList(), testee2.toList());
	}
	
	/**
	 * コントストラクタで生成される内容は空のマップである.
	 */
	@Test
	public void testToList() {
		ShapedRecipeMaterialMap testee = new ShapedRecipeMaterialMap();
		List<Object> ret1 = testee.toList();
		List<Object> ret2 = new LinkedList<>();
		
		assertEquals(ret1, ret2);
	}
	
	/**
	 * putは内部のマップに値を追加する.
	 */
	@Test
	public void testPut() {
		List<Object> ret1 = new ShapedRecipeMaterialMap()
		    .put('A', new MinecraftItemMock("acacia_door"))
		    .put('B', new MinecraftItemMock("apple"))
		    .put('C', new MinecraftItemMock("arrow"))
		    .toList();
		
		List<Object> ret2 = new LinkedList<>();
		ret2.add('A');
		ret2.add(new ItemMock("acacia_door"));
		ret2.add('B');
		ret2.add(new ItemMock("apple"));
		ret2.add('C');
		ret2.add(new ItemMock("arrow"));
		
		assertEquals(ret1, ret2);
	}
}
