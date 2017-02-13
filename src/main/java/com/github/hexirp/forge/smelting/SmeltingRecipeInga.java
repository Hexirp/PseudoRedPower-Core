package com.github.hexirp.forge.smelting;

import com.github.hexirp.forge.item.MinecraftItem;

import net.minecraft.item.ItemStack;

/**
 * 材料と結果の対応を表現する.
 *
 * 原因と結果の結びつきを意味する因果から名前を取っている。
 *
 * @author Hexirp
 */
public class SmeltingRecipeInga {
	/** 結果. */
	private final MinecraftItem product;
	
	/** 材料. */
	private final MinecraftItem material;
	
	/**
	 * Setter.
	 *
	 * @param product {@link #product}
	 * @param material {@link #material}
	 */
	public SmeltingRecipeInga(final MinecraftItem product, final MinecraftItem material) {
		this.product = product;
		this.material = material;
	}
	
	/**
	 * 結果を取り出す.
	 *
	 * @return 結果
	 */
	public ItemStack getProduct() {
		return new ItemStack(product.get());
	}
	
	/**
	 * 材料を取り出す.
	 *
	 * @return 材料
	 */
	public ItemStack getMaterial() {
		return new ItemStack(material.get());
	}
}