package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;

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
		assertEquals(new ShapedRecipeMaterialMap().list(), new ShapedRecipeMaterialMap().list());
	}
	
	/**
	 * コントストラクタで生成される内容は空のマップである.
	 */
	@Test
	public void testToList() {
		assertEquals(new ShapedRecipeMaterialMap().list(), new LinkedList<>());
	}
	
	/**
	 * putは内部のマップに値を追加する.
	 */
	@SuppressWarnings("serial")
	@Test
	public void testPut() {
		assertEquals(
		    new ShapedRecipeMaterialMap()
		        .put('A', new MinecraftItemMock("acacia_door"))
		        .list(),
		    new LinkedList<Object>() {
			    {
				    add('A');
				    add(new ItemMock("acacia_door"));
			    }
		    });
	}
}