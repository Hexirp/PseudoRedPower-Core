package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Setting;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;

/**
 * 文字とアイテムの対応関係を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class MaterialPhase {
	/** 段階の記録. */
	protected final Pair<RecipeProduct, ShapedRecipeAbstractOrder> stack;
	
	/** 保存する値. */
	protected final ShapedRecipeMaterialMap value;
	
	/**
	 * @param stack {@lin #stack}
	 */
	@Setting
	public MaterialPhase(final Pair<RecipeProduct, ShapedRecipeAbstractOrder> stack) {
		this.stack = stack;
		this.value = new ShapedRecipeMaterialMap();
	}
}
