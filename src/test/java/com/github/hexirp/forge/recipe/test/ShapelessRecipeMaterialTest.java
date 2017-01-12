package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

/**
 * @author Hexirp
 * @see com.github.hexirp.forge.recipe.ShapelessRecipeMaterial
 */
public class ShapelessRecipeMaterialTest {
	
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testShapelessRecipeMaterial() {
		assertEquals(new ShapelessRecipeMaterial().calc(), new ShapelessRecipeMaterial().calc());
	}
	
	/**
	 * コントストラクタで生成される内容は空のリストである.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc() {
		Object[] ret1 = new ShapelessRecipeMaterial().calc();
		Object[] ret2 = new Object[] {};
		
		assertEquals(ret1, ret2);
	}
	
	/**
	 * addは内部のリストに値を追加する.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		final MinecraftItem A = new MinecraftItemMock("acacia_door");
		final MinecraftItem E = new MinecraftItemMock("emerald");
		
		Object[] ret1 = new ShapelessRecipeMaterial()
		    .add(A, 4)
		    .add(E, 1)
		    .calc();
		
		Object[] ret2 = new Object[] { A, A, A, A, E };
		
		assertEquals(ret1, ret2);
	}
	
	/**
	 * addのtimesは0以上でなければならない.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddInException() {
		new ShapelessRecipeMaterial().add(new MinecraftItemMock("bed"), -1);
	}
	
	/**
	 * addのtimesは0以上ではなければならない.
	 */
	@Test
	public void testAddInNonException() {
		new ShapelessRecipeMaterial().add(new MinecraftItemMock("bed"), 0);
	}
}
