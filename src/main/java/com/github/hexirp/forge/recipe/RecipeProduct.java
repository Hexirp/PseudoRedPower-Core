package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.item.MinecraftItem;

import net.minecraft.item.ItemStack;

/**
 * レシピの結果を表現する.
 *
 * @author Hexirp
 */
public class RecipeProduct {
	/** 生成物. */
	private final MinecraftItem output;
	
	/** 生成数. */
	private final int size;
	
	/**
	 * 結果を{@link ItemStack}の形式で取得する.
	 *
	 * @return 結果
	 */
	public ItemStack get() {
		return new ItemStack(output.get(), size);
	}
	
	/**
	 * Setter.
	 *
	 * @param output {@link #output}
	 * @param size {@link #size}
	 */
	public RecipeProduct(MinecraftItem output, int size) {
		this.output = output;
		this.size = size;
	}
}
