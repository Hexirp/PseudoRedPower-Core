package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeAbstractOrder
 */
public class ShapedRecipeAbstractOrderTest {
	/**
	 * コントストラクタは一定の内容を生成する.
	 */
	@Test
	public void testShapedRecipeAbstractOrder() {
		assertEquals(new ShapedRecipeAbstractOrder().order(), new ShapedRecipeAbstractOrder().order());
	}
	
	/**
	 * コントストラクタで生成される内容は空のリストである.
	 */
	@Test
	public void testOrder() {
		assertEquals(new ShapedRecipeAbstractOrder().order(), new LinkedList<>());
	}
	
	/**
	 * addは内部のリストに値を追加する.
	 */
	@SuppressWarnings("serial")
	@Test
	public void testAdd() {
		assertEquals(new ShapedRecipeAbstractOrder()
		    .add("AAA")
		    .order(), new LinkedList<String>() {
			    {
				    add("AAA");
			    }
		    });
	}
}