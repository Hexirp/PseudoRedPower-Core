package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.MaplikePhase;
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
        MaplikePhase<GettableTwoFields<GettableTwoFields<MinecraftItem, Integer>, ShapedRecipeAbstractOrder>, ShapedRecipeMaterialMap, ShapedRecipe, Character, MinecraftItem> {
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
	 * @param c 文字
	 * @param i 文字に対応するアイテム
	 * @return this
	 */
	@Override
	@Chaining
	public MaterialPhase set(final Character c, final MinecraftItem i) {
		second.put(c, i);
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
