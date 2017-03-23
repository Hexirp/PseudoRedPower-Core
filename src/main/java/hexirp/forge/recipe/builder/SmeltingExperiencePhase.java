package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.Phase;
import hexirp.collection.GettableTwoFields;
import hexirp.forge.MinecraftItem;

/**
 * 精錬レシピの経験値の量を定義する.
 *
 * @author Hexirp
 */
public class SmeltingExperiencePhase extends Phase<GettableTwoFields<MinecraftItem, MinecraftItem>, Integer, SmeltingTimesPhase, Integer> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingExperiencePhase(final GettableTwoFields<MinecraftItem, MinecraftItem> stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public SmeltingTimesPhase to(final Integer value) {
		return new SmeltingTimesPhase(this, value);
	}
}
