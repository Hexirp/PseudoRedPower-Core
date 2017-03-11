package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.collection.Pair;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapedRecipe;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.recipe.ShapedRecipeOrder;

/**
 * 文字とアイテムの対応関係を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class MaterialPhase extends Phase<Pair<RecipeProduct, ShapedRecipeAbstractOrder>, ShapedRecipeMaterialMap, ShapedRecipe, Unit> {
	/**
	 * @param stack これまでの段階の記録
	 */
	@Setting
	public MaterialPhase(final Pair<RecipeProduct, ShapedRecipeAbstractOrder> stack) {
		super(stack, new ShapedRecipeMaterialMap());
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public MaterialPhase set(final Pair<Character, MinecraftItem> element) {
		second().put(element.first(), element.second());
		return this;
	}
	
	@Override
	@Getting
	public ShapedRecipe to(final Unit value) {
		return new ShapedRecipe(first().first(), new ShapedRecipeOrder(first().second(), second()));
	}
}
