package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.Phase;
import hexirp.forge.MinecraftItem;

/**
 * 精錬レシピの材料を定義する段階を表す.
 *
 * @author Hexirp
 */
public class SmeltingMaterialPhase extends Phase<MinecraftItem, MinecraftItem, SmeltingExperiencePhase, Integer> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingMaterialPhase(final MinecraftItem stack, final MinecraftItem value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public SmeltingExperiencePhase to(final Integer value) {
		return new SmeltingExperiencePhase(this, value);
	}
}
