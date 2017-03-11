package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.FinalPhase;
import hexirp.collection.Pair;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapelessRecipe;
import hexirp.forge.recipe.ShapelessRecipeMaterial;

/**
 * 不定形レシピの材料を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ShapelessPhase extends FinalPhase<Pair<MinecraftItem, Integer>, ShapelessRecipeMaterial, ShapelessRecipe> {
	/**
	 * @param stack これまでの段階で保存された値
	 */
	@Setting
	public ShapelessPhase(final Pair<MinecraftItem, Integer> stack) {
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
		second().add(element, 1);
		return this;
	}
	
	@Override
	@Getting
	public ShapelessRecipe to() {
		return new ShapelessRecipe(new RecipeProduct(first().first(), first().second()), second());
	}
}