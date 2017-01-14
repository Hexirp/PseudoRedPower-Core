package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 抽象的なレシピの並べ方の定義の段階を表現する. */
public class ShapedOrderPhase {
	/** 抽象的なレシピの並べ方. */
	private final ShapedRecipeAbstractOrder order = new ShapedRecipeAbstractOrder();
	
	/**
	 * 抽象的なレシピの並べ方を取得する.
	 *
	 * @return {@link #order}
	 */
	ShapedRecipeAbstractOrder order() {
		return order;
	}
	
	/** 前段階. */
	private final ProductPhase product;
	
	/**
	 * レシピの結果を取得する.
	 *
	 * @return {@link #product}
	 */
	RecipeProduct product() {
		return product.product();
	}
	
	/**
	 * Setter.
	 *
	 * @param product {@link #product}
	 */
	ShapedOrderPhase(ProductPhase product) {
		this.product = product;
	}
	
	/**
	 * 行を追加する.
	 *
	 * @param str 行
	 * @return メソッドチェーン用
	 * @see ShapedRecipeAbstractOrder#add(String)
	 */
	public ShapedOrderPhase add(String str) {
		order.add(str);
		
		return this;
	}
	
	/**
	 * 対応関係の定義の段階に移行する.
	 *
	 * @return {@link MapPhase}
	 */
	public MapPhase map() {
		return new MapPhase(this);
	}
}