package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

/** 材料の定義の段階を表現する. */
public class ShapelessMaterialPhase implements FinalPhase<ShapelessRecipe> {
	/** 材料. */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/** 前段階. */
	private final ProductPhase product;
	
	/**
	 * Setter.
	 *
	 * @param product 結果
	 */
	ShapelessMaterialPhase(ProductPhase product) {
		this.product = product;
	}
	
	/**
	 * 材料を追加する.
	 *
	 * @param item 材料の種類
	 * @param n 材料の個数
	 * @return メソッドチェーン用
	 * @see ShapelessRecipeMaterial#add(MinecraftItem, int)
	 */
	public ShapelessMaterialPhase add(MinecraftItem item, int n) {
		material.add(item, n);
		
		return this;
	}
	
	@Override
	public ShapelessRecipe to() {
		return new ShapelessRecipe(product.product(), material);
	}
}