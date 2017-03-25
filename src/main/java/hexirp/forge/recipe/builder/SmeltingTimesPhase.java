package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.InfolessPhase;
import hexirp.collection.GettableTwoFields;
import hexirp.forge.MinecraftItem;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;
import hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * 精錬レシピの経験値が得られるまでの製錬回数を定義する段階を表す.
 *
 * @author Hexirp
 */
public class SmeltingTimesPhase
    extends
        InfolessPhase<GettableTwoFields<GettableTwoFields<MinecraftItem, MinecraftItem>, Integer>, Integer, SmeltingRecipe> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public SmeltingTimesPhase(final GettableTwoFields<GettableTwoFields<MinecraftItem, MinecraftItem>, Integer> stack, final Integer value) {
		super(stack, value);
	}
	
	@Override
	@Getting
	public SmeltingRecipe to() {
		return new SmeltingRecipe(
		    new SmeltingRecipeInga(first().first().first(), first().first().second()),
		    new SmeltingRecipeExp(first().second(), second()));
	}
	
}
