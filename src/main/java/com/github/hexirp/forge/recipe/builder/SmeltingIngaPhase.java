package com.github.hexirp.forge.recipe.builder;

import com.github.hexirp.builder.StackedPhase;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.smelting.SmeltingRecipeExp;
import com.github.hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * 製錬レシピの因果関係を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SmeltingIngaPhase extends StackedPhase<SmeltingRecipeInga> {
	/**
	 * Setter.
	 *
	 * @param product 結果
	 * @param material 材料
	 * @see SmeltingRecipeInga#SmeltingRecipeInga(MinecraftItem, MinecraftItem)
	 */
	public SmeltingIngaPhase(MinecraftItem product, MinecraftItem material) {
		super(new SmeltingRecipeInga(product, material));
	}
	
	/**
	 * 製錬レシピの経験値を定義する段階に移行する.
	 *
	 * @param exp 分子
	 * @param times 分母
	 * @return 製錬レシピの経験値を定義する段階
	 * @see SmeltingExpPhase#SmeltingExpPhase(SmeltingIngaPhase, SmeltingRecipeExp)
	 */
	public SmeltingExpPhase exp(int exp, int times) {
		return new SmeltingExpPhase(this, new SmeltingRecipeExp(exp, times));
	}
}