package com.github.hexirp.forge.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 材料と結果の対応を表現する. 原因と結果を結び付ける因果から名前を取っている。
 *
 * @author Hexirp
 */
public class SmeltingRecipeInga {
	/** 結果. */
	private final Item product;
	
	/** 材料. */
	private final Item material;
	
	/**
	 * コントストラクタ.
	 *
	 * @param product 結果
	 * @param material 材料
	 */
	public SmeltingRecipeInga(Item product, Item material) {
		this.product = product;
		this.material = material;
	}
	
	/**
	 * 結果を取り出す.
	 *
	 * @return 結果
	 */
	public Item getProduct() {
		return product;
	}
	
	/**
	 * 材料を取り出す.
	 * 
	 * @return 材料
	 */
	public ItemStack getMaterial() {
		return new ItemStack(material);
	}
}