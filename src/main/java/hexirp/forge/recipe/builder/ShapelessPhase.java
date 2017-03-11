package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;
import hexirp.forge.recipe.ShapelessRecipe;
import hexirp.forge.recipe.ShapelessRecipeMaterial;

/**
 * 不定形レシピの材料を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ShapelessPhase {
	/** 段階の記録. */
	protected final RecipeProduct stack;
	
	/** 保存する値. */
	protected final ShapelessRecipeMaterial value;
	
	/**
	 * @param stack {@link #stack}
	 */
	@Setting
	public ShapelessPhase(final RecipeProduct stack) {
		this.stack = stack;
		this.value = new ShapelessRecipeMaterial();
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public ShapelessPhase set(final MinecraftItem element) {
		value.add(element, 1);
		return this;
	}
	
	/**
	 * @param value void
	 * @return {@link ShapelessRecipe}-完成物
	 */
	@Getting
	public ShapelessRecipe to(final Unit value) {
		return new ShapelessRecipe(stack, this.value);
	}
}
