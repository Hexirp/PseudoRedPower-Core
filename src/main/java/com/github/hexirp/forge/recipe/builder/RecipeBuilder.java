package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;

/**
 * レシピを定義するための補助クラスを表現する.
 *
 * @author Hexirp
 */
public class RecipeBuilder {
	/**
	 * 結果を定義する段階に移行する.
	 *
	 * @param output 作成物の種類
	 * @param size 作成物の数
	 * @return 結果を定義する段階
	 * @see ProductPhase#ProductPhase(MinecraftItem, int)
	 */
	public ProductPhase product(MinecraftItem output, int size) {
		return new ProductPhase(output, size);
	}
}
