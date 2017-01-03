package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;

import net.minecraft.init.Items;

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
		ShapedRecipeMaterialMap testee = new ShapedRecipeMaterialMap();
		List<Object> ret1 = testee
		    .put('A', new MinecraftItem(Items.acacia_door))
		    .put('B', new MinecraftItem(Items.apple))
		    .put('C', new MinecraftItem(Items.arrow))
		    .toList();
		
		List<Object> ret2 = new LinkedList<>();
		ret2.add('A');
		ret2.add(new MinecraftItem(Items.acacia_door));
		ret2.add('B');
		ret2.add(new MinecraftItem(Items.apple));
		ret2.add('C');
		ret2.add(new MinecraftItem(Items.arrow));
		
		assertEquals(ret1, ret2);
	}
}
