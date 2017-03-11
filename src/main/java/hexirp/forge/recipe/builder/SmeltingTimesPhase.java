package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.annotation.NonNull;
import hexirp.builder.Phase;
import hexirp.collection.Pair;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;
import hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * 精錬レシピの経験値が得られるまでの製錬回数を定義する段階を表す.
 *
 * @author Hexirp
 */
public class SmeltingTimesPhase extends Phase<Pair<Pair<MinecraftItem, MinecraftItem>, Integer>, Integer, SmeltingRecipe, Unit> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingTimesPhase(final Pair<Pair<MinecraftItem, MinecraftItem>, Integer> stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public @NonNull SmeltingRecipe to(final Unit value) {
		return new SmeltingRecipe(
		    new SmeltingRecipeInga(first().first().first(), first().first().second()),
		    new SmeltingRecipeExp(first().second(), second()));
	}
	
}
