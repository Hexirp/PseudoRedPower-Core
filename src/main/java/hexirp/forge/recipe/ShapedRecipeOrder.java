package hexirp.forge.recipe;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.collection.ListUtil;

/**
 * {@link ShapedRecipeAbstractOrder}と{@link ShapedRecipeMaterialMap}を合わせてレシピの並べ方を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeOrder {
	/** 文字で抽象的に表現された並べ方. */
	private final ShapedRecipeAbstractOrder order;
	
	/** 文字とアイテムとの対応関係. */
	private final ShapedRecipeMaterialMap input;
	
	/**
	 * @param order {@link #order}
	 * @param input {@link #input}
	 */
	@Setting
	public ShapedRecipeOrder(final ShapedRecipeAbstractOrder order, final ShapedRecipeMaterialMap input) {
		this.order = order;
		this.input = input;
	}
	
	/**
	 * @return 配列での表現
	 */
	@Getting
	public Object[] array() {
		return new ListUtil<>()
		    .merge(order.order())
		    .merge(input.list())
		    .array();
	}
}
