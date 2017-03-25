package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.InfolessPhase;
import hexirp.collection.GettableTwoFields;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapelessRecipe;
import hexirp.forge.recipe.ShapelessRecipeMaterial;

/**
 * 不定形レシピの材料を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ShapelessPhase extends InfolessPhase<GettableTwoFields<MinecraftItem, Integer>, ShapelessRecipeMaterial, ShapelessRecipe> {
	/**
	 * @param stack これまでの段階で保存された値
	 */
	@Setting
	public ShapelessPhase(final GettableTwoFields<MinecraftItem, Integer> stack) {
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
	
	@Override
	@Getting
	public ShapelessRecipe to() {
		return new ShapelessRecipe(new RecipeProduct(first().first(), first().second()), second());
	}
}
