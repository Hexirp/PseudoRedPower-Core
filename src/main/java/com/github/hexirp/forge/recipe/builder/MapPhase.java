package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapedRecipe;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;

/** 対応関係の定義の段階の表現 */
public class MapPhase {
	/** 対応関係. */
	private final ShapedRecipeMaterialMap map = new ShapedRecipeMaterialMap();
	
	/** 並び. */
	private final ShapedRecipeAbstractOrder order;
	
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/**
	 * Setter.
	 *
	 * @param product 返り値
	 * @param order 並び
	 */
	MapPhase(RecipeProduct product, ShapedRecipeAbstractOrder order) {
		this.product = product;
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
	public ShapedRecipe toRecipe() {
		return new ShapedRecipe(product, new ShapedRecipeOrder(order, map));
	}
}