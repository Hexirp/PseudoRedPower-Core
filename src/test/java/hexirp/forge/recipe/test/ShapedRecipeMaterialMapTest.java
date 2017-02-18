package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeMaterialMap;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeMaterialMap
 */
public class ShapedRecipeMaterialMapTest {
	
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void testShapedRecipeMaterialMap() {
		assertEquals(new ShapedRecipeMaterialMap().toList(), new ShapedRecipeMaterialMap().toList());
	}
	
	/**
	 * コントストラクタで生成される内容は空のマップである.
	 */
	@Test
	public void testToList() {
		List<Object> ret1 = new ShapedRecipeMaterialMap().toList();
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
