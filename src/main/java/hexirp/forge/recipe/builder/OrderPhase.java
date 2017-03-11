package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Setting;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * 並び順を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OrderPhase {
	/** 段階の記録. */
	protected final RecipeProduct stack;
	
	/** 保存する値. */
	protected final ShapedRecipeAbstractOrder value;
	
	/**
	 * @param stack {@link #stack}
	 */
	@Setting
	public OrderPhase(final RecipeProduct stack) {
		this.stack = stack;
		this.value = new ShapedRecipeAbstractOrder();
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public OrderPhase set(final String element) {
		value.add(element);
		return this;
	}
}
