package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/** 抽象的なレシピの並べ方の定義の段階を表現する. */
public class ShapedOrderPhase extends StackedPhase<ProductPhase> implements SimpleTransitional<ShapedMaterialPhase> {
	/** 抽象的なレシピの並べ方. */
	private final ShapedRecipeAbstractOrder order = new ShapedRecipeAbstractOrder();
	
	/**
	 * 抽象的なレシピの並べ方を取得する.
	 *
	 * @return {@link #order}
	 */
	@Getting
	public ShapedRecipeAbstractOrder order() {
		return order;
	}
	
	/**
	 * Setter.
	 *
	 * @param product {@link #previous}
	 */
	@Setting
	public ShapedOrderPhase(final ProductPhase product) {
		super(product);
	}
	
	/**
	 * 行を追加する.
	 *
	 * @param str 行
	 * @return メソッドチェーン用
	 */
	@Chaining
	public ShapedOrderPhase add(final String str) {
		order.add(str);
		
		return this;
	}
	
	@Override
	@Getting
	public ShapedMaterialPhase to() {
		return new ShapedMaterialPhase(this);
	}
}
