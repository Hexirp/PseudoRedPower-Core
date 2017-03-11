package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Setting;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * 数量を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SizePhase extends Phase<MinecraftItem, Integer, OrderPhase, Unit> {
	/**
	 * @param stack これまでの段階で保存された値
	 * @param value この段階で保存する値
	 */
	@Setting
	public SizePhase(final MinecraftItem stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	public OrderPhase to(final Unit value) {
		return new OrderPhase(this);
	}
	
	/**
	 * @param value void
	 * @return {@link ShapelessPhase}-次の段階
	 */
	public ShapelessPhase to2(final Unit value) {
		return new ShapelessPhase(this);
	}
}
