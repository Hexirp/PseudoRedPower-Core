package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapedRecipe;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;

/**
 * 対応関係の定義の段階を表現する.
 *
 * @author Hexirp
 */
public class ShapedMaterialPhase implements FinalPhase<ShapedRecipe> {
	/** 対応関係. */
	private final ShapedRecipeMaterialMap map = new ShapedRecipeMaterialMap();
	
	/** 前段階. */
	private final ShapedOrderPhase order;
	
	/**
	 * Setter.
	 *
	 * @param order {@link #order}
	 */
	ShapedMaterialPhase(ShapedOrderPhase order) {
		this.order = order;
	}
	
	/**
	 * 対応関係を追加する.
	 *
	 * @param key アルファベット大文字
	 * @param value 材料
	 * @return メソッドチェーン用
	 * @see ShapedRecipeMaterialMap#put(Character, MinecraftItem)
	 */
	public ShapedMaterialPhase put(Character key, MinecraftItem value) {
		map.put(key, value);
		return this;
	}
	
	@Override
	public ShapedRecipe to() {
		return new ShapedRecipe(order.product(), new ShapedRecipeOrder(order.order(), map));
	}
}