package com.github.hexirp.forge.recipe;

import com.github.hexirp.forge.Recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 製錬レシピそのものを表現する.
 *
 * @author Hexirp
 */
public class SmeltingRecipe implements Recipe {
	/** 結果. */
	private final Item product;
	
	/** 材料. */
	private final Item material;
	
	/** 経験値が得られる確率. */
	private final float exp;
	
	/**
	 * コントストラクタ.
	 *
	 * @param product 結果
	 * @param material 材料
	 * @param exp 経験値が得られる確率. 0以上1以下でなければならない
	 */
	public SmeltingRecipe(Item product, Item material, float exp) {
		this.product = product;
		this.material = material;
		this.exp = exp;
	}
	
	@Override
	public void register() {
		GameRegistry.addSmelting(product, new ItemStack(material), exp);
	}
}
