package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.InfolessPhase;
import hexirp.collection.GettableTwoFields;
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
public class MaterialPhase
    extends
        InfolessPhase<GettableTwoFields<GettableTwoFields<MinecraftItem, Integer>, ShapedRecipeAbstractOrder>, ShapedRecipeMaterialMap, ShapedRecipe> {
	/**
	 * @param stack これまでの段階の記録
	 */
	@Setting
	public MaterialPhase(final GettableTwoFields<GettableTwoFields<MinecraftItem, Integer>, ShapedRecipeAbstractOrder> stack) {
		super(stack, new ShapedRecipeMaterialMap());
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public MaterialPhase set(final GettableTwoFields<Character, MinecraftItem> element) {
		second.put(element.first(), element.second());
		return this;
	}
	
	@Override
	@Getting
	public ShapedRecipe to() {
		return new ShapedRecipe(
		    new RecipeProduct(first().first().first(), first().first().second()),
		    new ShapedRecipeOrder(first().second(), second()));
	}
}
