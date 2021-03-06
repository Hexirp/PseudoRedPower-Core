package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.BranchedPhase;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * 数量を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SizePhase extends BranchedPhase<MinecraftItem, Integer, OrderPhase, Unit, ShapelessPhase, Unit> {
	/**
	 * @param stack これまでの段階で保存された値
	 * @param value この段階で保存する値
	 */
	@Setting
	public SizePhase(final MinecraftItem stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public OrderPhase to(final Unit value) {
		return to();
	}
	
	/**
	 * @return {@link #to(Unit)}
	 */
	@Getting
	public OrderPhase to() {
		return new OrderPhase(this);
	}
	
	@Override
	@Getting
	public ShapelessPhase to2(final Unit value) {
		return to2();
	}
	
	/**
	 * @return {@link #to2(Unit)}
	 */
	@Getting
	public ShapelessPhase to2() {
		return new ShapelessPhase(this);
	}
}
