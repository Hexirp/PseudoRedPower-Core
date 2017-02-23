package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapelessRecipeMaterial;
import hexirp.forge.test.MinecraftItemMock;
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
		assertEquals(new ShapelessRecipeMaterial().array(), new ShapelessRecipeMaterial().array());
	}
	
	/**
	 * コントストラクタで生成される内容は空のリストである.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc() {
		assertEquals(new ShapelessRecipeMaterial().array(), new Object[] {});
	}
	
	/**
	 * addは内部のリストに値を追加する.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		final MinecraftItem A = new MinecraftItemMock("acacia_door");
		final Item a = A.item();
		final MinecraftItem E = new MinecraftItemMock("emerald");
		final Item e = E.item();
		
		assertEquals(
		    new ShapelessRecipeMaterial().add(A, 4).add(E, 1).array(),
		    new Object[] { a, a, a, a, e });
	}
}