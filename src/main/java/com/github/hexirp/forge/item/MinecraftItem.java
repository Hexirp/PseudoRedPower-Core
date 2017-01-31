package com.github.hexirp.forge.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * {@link Item}を表現する.
 *
 * {@link Item}と{@link Block}を統一的に取り扱うために作成された。
 *
 * @author Hexirp
 */
public class MinecraftItem {
	/** アイテム. */
	private final Item obj;
	
	/**
	 * Setter.
	 *
	 * @param item {@link #obj}
	 */
	public MinecraftItem(final Item item) {
		obj = item;
	}
	
	/**
	 * ブロックもアイテムとして取り扱うことが出来るため、受け付ける.
	 *
	 * @param block {@link #obj}
	 */
	@SuppressWarnings("null")
	public MinecraftItem(final Block block) {
		this(Item.getItemFromBlock(block));
	}
	
	/**
	 * 内部のアイテムを取得する.
	 *
	 * @return {@link #obj}
	 */
	public Item get() {
		return obj;
	}
}
