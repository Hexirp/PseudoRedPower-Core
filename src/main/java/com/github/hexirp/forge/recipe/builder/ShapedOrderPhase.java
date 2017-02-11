package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.SimpleTransitional;
import com.github.hexirp.builder.StackedPhase;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 抽象的なレシピの並べ方の定義の段階を表現する. */
public class ShapedOrderPhase
    extends
        StackedPhase<ProductPhase>
    implements
        SimpleTransitional<ShapedMaterialPhase> {
	/** 抽象的なレシピの並べ方. */
	private final ShapedRecipeAbstractOrder order = new ShapedRecipeAbstractOrder();
	
	/**
	 * 抽象的なレシピの並べ方を取得する.
	 *
	 * @return {@link #order}
	 */
	public ShapedRecipeAbstractOrder order() {
		return order;
	}
	
	/**
	 * Setter.
	 *
	 * @param product {@link #previous}
	 */
	public ShapedOrderPhase(final ProductPhase product) {
		super(product);
	}
	
	/**
	 * 行を追加する.
	 *
	 * @param str 行
	 * @return メソッドチェーン用
	 */
	public ShapedOrderPhase add(final String str) {
		order.add(str);
		
		return this;
	}
	
	@Override
	public ShapedMaterialPhase to() {
		return new ShapedMaterialPhase(this);
	}
}