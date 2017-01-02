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
	/** 結果. */
	private final Item output;
	
	/** 生成数 */
	private final int size;
	
	/**
	 * Getter
	 *
	 * @return 内部の値
	 */
	public ItemStack get() {
		return new ItemStack(output, size);
	}
	
	/**
	 * アイテムを使用する場合のコントストラクタ.
	 *
	 * @param output レシピの結果となるアイテム
	 * @param size アイテムのスタック数
	 */
	public RecipeProduct(Item output, int size) {
		this.output = output;
		this.size = size;
	}
	
	/**
	 * ブロックを使用する場合のコントストラクタ.
	 *
	 * @param output レシピの結果となるアイテム
	 * @param size アイテムのスタック数
	 */
	public RecipeProduct(Block output, int size) {
		this.output = Item.getItemFromBlock(output);
		this.size = size;
	}
}
