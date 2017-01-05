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
	 * Setter.
	 *
	 * @param item アイテム
	 */
	public MinecraftItem(net.minecraft.item.Item item) {
		obj = item;
	}
	
	/**
	 * ブロックを受け取りそれをアイテムに変換する.
	 *
	 * @param block ブロック
	 */
	public MinecraftItem(Block block) {
		obj = net.minecraft.item.Item.getItemFromBlock(block);
	}
	
	/**
	 * @return 保持していた値.
	 */
	public net.minecraft.item.Item get() {
		return obj;
	}
}
