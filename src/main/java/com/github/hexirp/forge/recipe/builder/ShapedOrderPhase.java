package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.PreviousPhase;
import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 抽象的なレシピの並べ方の定義の段階を表現する. */
public class ShapedOrderPhase extends PreviousPhase<ProductPhase> {
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
	 * レシピの結果を取得する.
	 *
	 * @return {@link ProductPhase#product()}
	 */
	RecipeProduct product() {
		return previous.product();
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