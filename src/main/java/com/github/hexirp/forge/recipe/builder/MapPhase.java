package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.ShapedRecipe;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;

/** 対応関係の定義の段階の表現. */
public class MapPhase {
	/** 対応関係. */
	private final ShapedRecipeMaterialMap map = new ShapedRecipeMaterialMap();
	
	/** 並び. */
	final ShapedOrderPhase order;
	
	/**
	 * Setter.
	 *
	 * @param order 並び
	 */
	MapPhase(ShapedOrderPhase order) {
		this.order = order;
	}
	
	/**
	 * 追加.
	 *
	 * @param key 文字
	 * @param value ItemかBlock
	 * @return 自分自身
	 */
	public MapPhase put(Character key, MinecraftItem value) {
		map.put(key, value);
		return this;
	}
	
	/**
	 * レシピ生成.
	 *
	 * @return 完成したレシピ
	 */
	public ShapedRecipe to() {
		return new ShapedRecipe(order.product(), new ShapedRecipeOrder(order.order(), map));
	}
}