package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 並びの定義の段階の表現. */
public class ShapedOrderPhase {
	/** 並び. */
	private final ShapedRecipeAbstractOrder order = new ShapedRecipeAbstractOrder();
	
	/** @return order */
	ShapedRecipeAbstractOrder order() {
		return order;
	}
	
	/** レシピの結果. */
	private final ProductPhase product;
	
	/** @return product */
	RecipeProduct product() {
		return product.product();
	}
	
	/**
	 * Setter.
	 *
	 * @param product 返り値
	 */
	ShapedOrderPhase(ProductPhase product) {
		this.product = product;
	}
	
	/**
	 * 行の追加.
	 *
	 * @param str 行
	 * @return 自分自身
	 */
	public ShapedOrderPhase add(String str) {
		order.add(str);
		
		return this;
	}
	
	/** @return 対応関係の定義の段階への移行 */
	public MapPhase map() {
		return new MapPhase(this);
	}
}