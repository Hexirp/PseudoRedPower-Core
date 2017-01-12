package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.forge.item.MinecraftItem;

/**
 * レシピを定義するための補助クラス.
 *
 * @author Hexirp
 */
public class RecipeBuilder {
	/**
	 * 結果を定義する段階への移行.
	 *
	 * @param output 作成物の種類
	 * @param size 作成物の数
	 * @return 結果を定義する段階
	 */
	public ProductPhase product(MinecraftItem output, int size) {
		return new ProductPhase(output, size);
	}
}
