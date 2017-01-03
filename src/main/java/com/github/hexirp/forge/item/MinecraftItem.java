package com.github.hexirp.forge.item;

import net.minecraft.block.Block;

/**
 * Minecraftのアイテムを表現する.
 *
 * @author Hexirp
 */
public class MinecraftItem {
	/** 保持するItem. */
	private final net.minecraft.item.Item obj;
	
	/**
	 * コントストラクタ
	 *
	 * @param item アイテム
	 */
	public MinecraftItem(net.minecraft.item.Item item) {
		obj = item;
	}
	
	/**
	 * コントストラクタ
	 *
	 * @param block ブロック
	 */
	public MinecraftItem(Block block) {
		obj = net.minecraft.item.Item.getItemFromBlock(block);
	}
	
	/**
	 * Getter.
	 * 
	 * @return 保持していた値
	 */
	public net.minecraft.item.Item get() {
		return obj;
	}
}
