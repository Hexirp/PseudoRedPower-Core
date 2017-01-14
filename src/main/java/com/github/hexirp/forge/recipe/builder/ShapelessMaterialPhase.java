package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.FinalPhase;
import com.github.hexirp.builder.PreviousPhase;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

/** 材料の定義の段階を表現する. */
public class ShapelessMaterialPhase extends PreviousPhase<ProductPhase> implements
    FinalPhase<ShapelessRecipe> {
	/** 材料. */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/**
	 * Setter.
	 *
	 * @param product 結果
	 */
	public ShapelessMaterialPhase(ProductPhase product) {
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
	public ShapelessMaterialPhase add(MinecraftItem item, int n) {
		material.add(item, n);
		
		return this;
	}
	
	@Override
	public ShapelessRecipe to() {
		return new ShapelessRecipe(previous.product(), material);
	}
}