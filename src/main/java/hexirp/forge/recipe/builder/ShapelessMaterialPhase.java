package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapelessRecipe;
import hexirp.forge.recipe.ShapelessRecipeMaterial;

/** 材料の定義の段階を表現する. */
public class ShapelessMaterialPhase extends StackedPhase<ProductPhase> implements SimpleTransitional<ShapelessRecipe> {
	/** 材料. */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/**
	 * @param product 結果
	 */
	@Setting
	public ShapelessMaterialPhase(final ProductPhase product) {
		super(product);
	}
	
	/**
	 * 材料を追加する.
	 *
	 * @param item 材料の種類
	 * @param n 材料の個数
	 * @return メソッドチェーン用
	 * @see ShapelessRecipeMaterial#add(MinecraftItem, int)
	 */
	@Chaining
	public ShapelessMaterialPhase add(final MinecraftItem item, final int n) {
		material.add(item, n);
		
		return this;
	}
	
	@Override
	@Getting
	public ShapelessRecipe to() {
		return new ShapelessRecipe(previous().previous(), material);
	}
}
