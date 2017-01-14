package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 抽象的なレシピの並べ方の定義の段階を表現する. */
public class ShapedOrderPhase extends PreviousProductPhase {
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
	
	/**
	 * Setter.
	 *
	 * @param product {@link #previous}
	 */
	ShapedOrderPhase(ProductPhase product) {
		super(product);
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
	 * @return {@link ShapedMaterialPhase}
	 */
	public ShapedMaterialPhase map() {
		return new ShapedMaterialPhase(this);
	}
}