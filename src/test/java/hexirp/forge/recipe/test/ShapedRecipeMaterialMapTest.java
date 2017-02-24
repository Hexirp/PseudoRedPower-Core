package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.test.ItemMock;
import hexirp.forge.test.MinecraftItemMock;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeMaterialMapTest {
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void test_ShapedRecipeMaterialMap() {
		assertEquals(
		    new ShapedRecipeMaterialMap().list(),
		    new ShapedRecipeMaterialMap().list());
	}
	
	/**
	 * コントストラクタで生成される内容は空のマップである.
	 */
	@Test
	public void test_toList() {
		assertEquals(
		    new ShapedRecipeMaterialMap().list(),
		    new LinkedList<>());
	}
	
	/**
	 * putは副作用を持つ.
	 */
	@Test
	public void test_put_effect() {
		final ShapedRecipeMaterialMap testee1 = new ShapedRecipeMaterialMap();
		final ShapedRecipeMaterialMap testee2 = testee1.put('A', new MinecraftItemMock("acacia_door"));
		
		assertEquals(testee1, testee2);
	}
	
	/**
	 * putは内部のマップに値を追加する.
	 */
	@Test
	public void test_put() {
		final List<Object> testee1 = new ShapedRecipeMaterialMap()
		    .put('A', new MinecraftItemMock("acacia_door"))
		    .list();
		
		final LinkedList<Object> testee2 = new LinkedList<>();
		
		testee2.add('A');
		testee2.add(new ItemMock("acacia_door"));
		
		assertEquals(testee1, testee2);
	}
}