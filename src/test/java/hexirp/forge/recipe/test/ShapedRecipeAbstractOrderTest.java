package hexirp.forge.recipe.test;

import static hexirp.annotation.test.MethodLaw.*;
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
	public final void testShapedRecipeAbstractOrder() {
		assertSetting(testee);
		
		assertEquals(testee.get().order(), new LinkedList<>());
	}
	
	/** addは副作用を持つ. */
	@Test
	public final void testAdd() {
		assertChaining(testee.get(), t -> t.add(""));
		
		final List<String> testee1 = testee.get().add("AAA").order();
		final LinkedList<String> testee2 = new LinkedList<String>();
		testee2.add("AAA");
		
		assertEquals(testee1, testee2);
	}
	
	/** orderは副作用を持たない. */
	@Test
	public final void testOrder() {
		assertGetting(testee.get(), t -> t.order());
	}
}
