package hexirp.forge.recipe;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.ListUtil;
import hexirp.collection.TwoFields;

/**
 * レシピの並べ方を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeOrder extends TwoFields<ShapedRecipeAbstractOrder, ShapedRecipeMaterialMap> {
	/**
	 * @param first 文字で抽象的に表現された並べ方
	 * @param second 文字とアイテムとの対応関係
	 */
	@Setting
	public ShapedRecipeOrder(final ShapedRecipeAbstractOrder first, final ShapedRecipeMaterialMap second) {
		super(first, second);
	}
	
	/**
	 * @return 配列での表現
	 */
	@Getting
	public Object[] array() {
		return new ListUtil<>().merge(first.order()).merge(second.list()).array();
	}
}
