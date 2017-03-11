package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;

/**
 * 数量を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SizePhase extends TuplikePhase<MinecraftItem, Integer, OrderPhase, Unit> {
	/**
	 * @param stack {@link #stack}
	 * @param value {@link #value}
	 */
	@Setting
	public SizePhase(final MinecraftItem stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	public OrderPhase to(final Unit value) {
		return new OrderPhase(new RecipeProduct(stack, this.value));
	}
}
