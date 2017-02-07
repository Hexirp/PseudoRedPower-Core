package com.github.hexirp.forge.prp.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * アイテム状態の銀鉱石を表現する.
 *
 * @author Hexirp
 */
public class SilverOreItem extends ItemBlock {
	/**
	 * コントストラクタ.
	 *
	 * @param block アイテム状態を表現するブロック
	 */
	public SilverOreItem(final Block block) {
		super(block);
		setUnlocalizedName("silver_ore");
	}
}