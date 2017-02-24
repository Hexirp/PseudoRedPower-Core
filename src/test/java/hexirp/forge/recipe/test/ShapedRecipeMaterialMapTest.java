package hexirp.forge.recipe.test;

import static hexirp.test.TestUtil.*;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.test.ItemMock;
import hexirp.forge.test.MinecraftItemMock;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeMaterialMapTest {
	/** インスタンス生成機. */
	private static final Supplier<ShapedRecipeMaterialMap> spmm = ShapedRecipeMaterialMap::new;
	
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void test_ShapedRecipeMaterialMap() {
		assertEquals(spmm.get().list(), spmm.get().list());
	}
	
	/**
	 * コントストラクタで生成される内容は空のマップである.
	 */
	@Test
	public void test_toList() {
		assertEquals(spmm.get().list(), new LinkedList<>());
	}
	
	/**
	 * putは副作用を持つ.
	 */
	@Test
	public void test_put_effect() {
		method_chain_with_side_effects(spmm.get(), t -> t.put('A', new MinecraftItemMock("acacia_door")));
	}
	
	/**
	 * putは内部のマップに値を追加する.
	 */
	@Test
	public void test_put() {
		final List<Object> testee1 = spmm.get().put('A', new MinecraftItemMock("acacia_door")).list();
		
		final LinkedList<Object> testee2 = new LinkedList<>();
		testee2.add('A');
		testee2.add(new ItemMock("acacia_door"));
		
		assertEquals(testee1, testee2);
	}
}