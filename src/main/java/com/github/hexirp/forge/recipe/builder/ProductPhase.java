/**
 *
 */
package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * レシピを定義するための補助クラス.
 *
 * @author Hexirp
 */
public class ProductPhase {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/**
	 * コントストラクタ.
	 *
	 * @param output 結果
	 * @param size 生成数
	 */
	public ProductPhase(Item output, int size) {
		product = new RecipeProduct(output, size);
	}
	
	/**
	 * コントストラクタ.
	 *
	 * @param output 結果
	 * @param size 生成数
	 */
	public ProductPhase(Block output, int size) {
		product = new RecipeProduct(Item.getItemFromBlock(output), size);
	}
	
	/**
	 * 並びの定義の段階への移行.
	 *
	 * @return 並びの定義の段階
	 */
	public ShapedOrderPhase order() {
		return new ShapedOrderPhase(product);
	}
	
	/**
	 * 材料の定義の段階への移行.
	 *
	 * @return 並びの定義の段階
	 */
	public ShapelessOrderPhase material() {
		return new ShapelessOrderPhase(product);
	}
}
