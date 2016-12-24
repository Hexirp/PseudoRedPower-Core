package com.github.hexirp.forge.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * このクラスはレシピの結果を表現する.
 *
 * 実際にはItemStackを包むクラスである.
 *
 * @author Hexirp
 */
public class RecipeProduct {
	/** 保持対象. */
	private final ItemStack product;
	
	/** Getter */
	public ItemStack get() {
		return product;
	}
	
	/**
	 * アイテムを使用する場合のコントストラクタ.
	 *
	 * @param output レシピの結果となるアイテム
	 * @param size アイテムのスタック数
	 */
	public RecipeProduct(Item output, int size) {
		product = new ItemStack(output, size);
	}
	
	/**
	 * ブロックを使用する場合のコントストラクタ.
	 *
	 * @param output レシピの結果となるブロック
	 * @param size ブロックのスタック数
	 */
	public RecipeProduct(Block output, int size) {
		product = new ItemStack(output, size);
	}
}
