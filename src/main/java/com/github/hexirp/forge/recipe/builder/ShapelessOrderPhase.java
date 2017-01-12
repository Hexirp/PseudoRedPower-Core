package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

/** 材料の定義の段階の表現. */
public class ShapelessOrderPhase implements FinalPhase<ShapelessRecipe> {
	/** 材料. */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/** レシピの結果. */
	private final ProductPhase product;
	
	/**
	 * Setter.
	 *
	 * @param product 結果
	 */
	ShapelessOrderPhase(ProductPhase product) {
		this.product = product;
	}
	
	/**
	 * 追加.
	 *
	 * @param item アイテム
	 * @param n 個数
	 * @return 自分自身
	 */
	public ShapelessOrderPhase add(MinecraftItem item, int n) {
		material.add(item, n);
		
		return this;
	}
	
	@Override
	public ShapelessRecipe to() {
		return new ShapelessRecipe(product.product(), material);
	}
}