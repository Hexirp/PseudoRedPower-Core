package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.Phase;
import hexirp.collection.Pair;
import hexirp.forge.MinecraftItem;

/**
 * 精錬レシピの経験値の量を定義する.
 *
 * @author Hexirp
 */
public class SmeltingExperiencePhase extends Phase<Pair<MinecraftItem, MinecraftItem>, Integer, SmeltingTimesPhase, Integer> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingExperiencePhase(final Pair<MinecraftItem, MinecraftItem> stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public SmeltingTimesPhase to(final Integer value) {
		return new SmeltingTimesPhase(this, value);
	}
}
