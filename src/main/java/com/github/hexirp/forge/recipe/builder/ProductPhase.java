package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.StackedPhase;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.recipe.RecipeProduct;

/**
 * レシピの結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ProductPhase extends StackedPhase<RecipeProduct> {
	/**
	 * Setter.
	 *
	 * @param output 結果の種類
	 * @param size 結果の数
	 */
	public ProductPhase(final MinecraftItem output, final int size) {
		super(new RecipeProduct(output, size));
	}
	
	/**
	 * 並びの定義の段階に移行する.
	 *
	 * @return {@link ShapedOrderPhase}
	 */
	public ShapedOrderPhase order() {
		return new ShapedOrderPhase(this);
	}
	
	/**
	 * 材料の定義の段階に移行する.
	 *
	 * @return {@link ShapelessMaterialPhase}
	 */
	public ShapelessMaterialPhase material() {
		return new ShapelessMaterialPhase(this);
	}
}