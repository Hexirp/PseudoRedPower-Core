package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.StackedPhase;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.RecipeProduct;

/**
 * レシピの結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class ProductPhase extends StackedPhase<RecipeProduct> {
	/**
	 * @param output 結果の種類
	 * @param size 結果の数
	 */
	@Setting
	public ProductPhase(final MinecraftItem output, final int size) {
		super(new RecipeProduct(output, size));
	}
	
	/**
	 * 並びの定義の段階に移行する.
	 *
	 * @return {@link ShapedOrderPhase}
	 */
	@Getting
	public ShapedOrderPhase order() {
		return new ShapedOrderPhase(this);
	}
	
	/**
	 * 材料の定義の段階に移行する.
	 *
	 * @return {@link ShapelessMaterialPhase}
	 */
	@Getting
	public ShapelessMaterialPhase material() {
		return new ShapelessMaterialPhase(this);
	}
}
