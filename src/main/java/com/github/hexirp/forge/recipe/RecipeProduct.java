package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.item.MinecraftItem;

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
	private final MinecraftItem output;
	
	/** 生成数 */
	private final int size;
	
	/**
	 * Getter
	 *
	 * @return 内部の値
	 */
	public ItemStack get() {
		return new ItemStack(output.get(), size);
	}
	
	/**
	 * コントストラクタ.
	 *
	 * @param output レシピの結果となるアイテム
	 * @param size アイテムのスタック数
	 */
	public RecipeProduct(MinecraftItem output, int size) {
		this.output = output;
		this.size = size;
	}
}
