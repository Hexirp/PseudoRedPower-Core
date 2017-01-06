package com.github.hexirp.forge.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Minecraftのアイテムを表現する.
 *
 * @author Hexirp
 */
public class MinecraftItem {
	/** 保持するItem. */
	private final Item obj;
	
	/**
	 * Setter.
	 *
	 * @param item アイテム
	 */
	public MinecraftItem(Item item) {
		obj = item;
	}
	
	/**
	 * ブロックを受け取りそれをアイテムに変換する.
	 *
	 * @param block ブロック
	 */
	public MinecraftItem(Block block) {
		obj = Item.getItemFromBlock(block);
	}
	
	/**
	 * @return 保持していた値.
	 */
	public Item get() {
		return obj;
	}
}
