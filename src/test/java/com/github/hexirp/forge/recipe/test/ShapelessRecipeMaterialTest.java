package com.github.hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

import net.minecraft.init.Items;

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
		ShapelessRecipeMaterial testee1 = new ShapelessRecipeMaterial();
		ShapelessRecipeMaterial testee2 = new ShapelessRecipeMaterial();
		
		assertEquals(testee1.calc(), testee2.calc());
	}
	
	/**
	 * コントストラクタで生成される内容は空のリストである.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc() {
		ShapelessRecipeMaterial testee = new ShapelessRecipeMaterial();
		Object[] ret1 = testee.calc();
		Object[] ret2 = new Object[] {};
		
		assertEquals(ret1, ret2);
	}
	
	/**
	 * addは内部のリストに値を追加する.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		final MinecraftItem A = new MinecraftItem(Items.acacia_door);
		final MinecraftItem E = new MinecraftItem(Items.emerald);
		
		ShapelessRecipeMaterial testee = new ShapelessRecipeMaterial();
		Object[] ret1 = testee
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
		new ShapelessRecipeMaterial().add(new MinecraftItem(Items.bed), -1);
	}
	
	/**
	 * addのtimesは0以上ではなければならない.
	 */
	@Test
	public void testAddInNonException() {
		new ShapelessRecipeMaterial().add(new MinecraftItem(Items.bed), 0);
	}
}