package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * 並び順を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OrderPhase extends TuplikePhase<RecipeProduct, ShapedRecipeAbstractOrder, MaterialPhase, Unit> {
	/**
	 * @param stack {@link #stack}
	 */
	@Setting
	public OrderPhase(final RecipeProduct stack) {
		super(stack, new ShapedRecipeAbstractOrder());
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
	
	@Override
	@Getting
	public MaterialPhase to(final Unit value) {
		return new MaterialPhase(new Pair<>(stack, this.value));
	}
}
