package hexirp.forge.recipe.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import org.junit.Test;

import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * @author Hexirp
 * @see hexirp.forge.recipe.ShapedRecipeAbstractOrder
 */
public final class ShapedRecipeAbstractOrderTest {
	/** インスタンス生成機. */
	private static final Supplier<ShapedRecipeAbstractOrder> testee = ShapedRecipeAbstractOrder::new;
	
	/** コントストラクタは一定の内容を生成する. */
	@Test
	public static final void testShapedRecipeAbstractOrder() {
		assertEquals(testee.get().order(), testee.get().order());
	}
	
	/** コントストラクタで生成される内容は空のリストである. */
	@Test
	public static final void testOrder() {
		assertEquals(testee.get().order(), new LinkedList<>());
	}
	
	/** addは内部のリストに値を追加する. */
	@Test
	public static final void testAdd() {
		final List<String> testee1 = testee.get().add("AAA").order();
		final LinkedList<String> testee2 = new LinkedList<String>();
		testee2.add("AAA");
		
		assertEquals(testee1, testee2);
	}
}
