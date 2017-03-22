package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.FinalPhase;
import hexirp.collection.TwoFields;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapelessRecipe;
import hexirp.forge.recipe.ShapelessRecipeMaterial;

/**
 * 不定形レシピの材料を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ShapelessPhase extends FinalPhase<TwoFields<MinecraftItem, Integer>, ShapelessRecipeMaterial, ShapelessRecipe> {
	/**
	 * @param stack これまでの段階で保存された値
	 */
	@Setting
	public ShapelessPhase(final TwoFields<MinecraftItem, Integer> stack) {
		super(stack, new ShapelessRecipeMaterial());
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public ShapelessPhase set(final MinecraftItem element) {
		second.add(element, 1);
		return this;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	@Getting
	public ShapelessRecipe to() {
		return new ShapelessRecipe(new RecipeProduct(first().first(), first().second()), second());
	}
}
