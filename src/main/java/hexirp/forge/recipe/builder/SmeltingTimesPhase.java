package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.FinalPhase;
import hexirp.collection.TwoFields;
import hexirp.forge.MinecraftItem;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;
import hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * 精錬レシピの経験値が得られるまでの製錬回数を定義する段階を表す.
 *
 * @author Hexirp
 */
public class SmeltingTimesPhase extends FinalPhase<TwoFields<TwoFields<MinecraftItem, MinecraftItem>, Integer>, Integer, SmeltingRecipe> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingTimesPhase(final TwoFields<TwoFields<MinecraftItem, MinecraftItem>, Integer> stack, final Integer value) {
		super(stack, value);
	}

	@SuppressWarnings("deprecation")
	@Override
	@Getting
	public SmeltingRecipe to() {
		return new SmeltingRecipe(
		    new SmeltingRecipeInga(first().first().first(), first().first().second()),
		    new SmeltingRecipeExp(first().second(), second()));
	}

}
