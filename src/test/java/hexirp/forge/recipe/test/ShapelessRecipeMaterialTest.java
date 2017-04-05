package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapelessRecipeMaterial;
import hexirp.forge.test.ItemMock;
import hexirp.forge.test.MinecraftItemMock;
import net.minecraft.item.Item;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapelessRecipeMaterial
 */
public class ShapelessRecipeMaterialTest {
	/** インスタンス生成機. */
	private static final Supplier<ShapelessRecipeMaterial> testee = ShapelessRecipeMaterial::new;
	
	/** コントストラクタは一定の内容を生成する. */
	@Test
	public void testShapelessRecipeMaterial() {
		assertArrayEquals(testee.get().array(), testee.get().array());
	}
	
	/** コントストラクタで生成される内容は空のリストである. */
	@Test
	public void testCalc() {
		assertArrayEquals(testee.get().array(), new Object[] {});
	}
	
	/** addは内部のリストに値を追加する. */
	@Test
	public void testAdd() {
		final MinecraftItem A = new MinecraftItemMock(new ItemMock("acacia_door"));
		final Item a = A.item();
		final MinecraftItem E = new MinecraftItemMock(new ItemMock("emerald"));
		final Item e = E.item();
		
		assertArrayEquals(
		    testee.get().add(A, 4).add(E, 1).array(),
		    new Object[] { a, a, a, a, e });
	}
}
