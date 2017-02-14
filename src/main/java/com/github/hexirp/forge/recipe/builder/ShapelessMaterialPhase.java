package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.SimpleTransitional;
import com.github.hexirp.builder.StackedPhase;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

/** 材料の定義の段階を表現する. */
public class ShapelessMaterialPhase
    extends
        StackedPhase<ProductPhase>
    implements
        SimpleTransitional<ShapelessRecipe> {
	/** 材料. */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/**
	 * Setter.
	 *
	 * @param product 結果
	 */
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
	public ShapelessMaterialPhase add(final MinecraftItem item, final int n) {
		material.add(item, n);
		
		return this;
	}
	
	@Override
	public ShapelessRecipe to() {
		return new ShapelessRecipe(previous().previous(), material);
	}
}