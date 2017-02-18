package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapelessRecipeMaterial;
import net.minecraft.item.Item;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapelessRecipeMaterial
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
		MinecraftItem A = new MinecraftItemMock("acacia_door");
		Item a = A.item();
		MinecraftItem E = new MinecraftItemMock("emerald");
		Item e = E.item();
		
		Object[] ret1 = new ShapelessRecipeMaterial()
		    .add(A, 4)
		    .add(E, 1)
		    .calc();
		
		Object[] ret2 = new Object[] { a, a, a, a, e };
		
		assertEquals(ret1, ret2);
	}
}
