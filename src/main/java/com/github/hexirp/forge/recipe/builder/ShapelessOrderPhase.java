package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/** 材料の定義の段階の表現 */
public class ShapelessOrderPhase {
	/** 材料 */
	private final ShapelessRecipeMaterial material = new ShapelessRecipeMaterial();
	
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/**
	 * @param product 結果
	 */
	ShapelessOrderPhase(RecipeProduct product) {
		this.product = product;
	}
	
	/**
	 * アイテムの場合の追加
	 *
	 * @param item アイテム
	 * @param n 個数
	 * @return 自分自身
	 */
	public ShapelessOrderPhase add(Item item, int n) {
		material.add(item, n);
		
		return this;
	}
	
	/**
	 * ブロックの場合の追加
	 *
	 * @param brock アイテム
	 * @param n 個数
	 * @return 自分自身
	 */
	public ShapelessOrderPhase add(Block brock, int n) {
		material.add(Item.getItemFromBlock(brock), n);
		
		return this;
	}
	
	/**
	 * レシピ生成
	 *
	 * @return 完成したレシピ
	 */
	public ShapelessRecipe toRecipe() {
		return new ShapelessRecipe(product, material);
	}
}