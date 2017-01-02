package com.github.hexirp.forge.smelting;

import com.github.hexirp.forge.Recipe;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 製錬レシピそのものを表現する.
 *
 * @author Hexirp
 */
public class SmeltingRecipe implements Recipe {
	/** 原因と結果 */
	private final SmeltingRecipeInga inga;
	
	/** 経験値が得られる確率. */
	private SmeltingRecipeExp exp;
	
	/**
	 * コントストラクタ.
	 *
	 * @param inga 材料と結果
	 * @param exp 経験値が得られる確率. 0以上1以下でなければならない
	 */
	public SmeltingRecipe(SmeltingRecipeInga inga, SmeltingRecipeExp exp) {
		this.inga = inga;
		this.exp = exp;
	}
	
	@Override
	public void register() {
		GameRegistry.addSmelting(inga.getProduct(), inga.getMaterial(), exp.calc());
	}
}
