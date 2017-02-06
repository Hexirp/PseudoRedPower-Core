package com.github.hexirp.forge.prp.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * 銀の鉱石を表現する.
 *
 * @author Hexirp
 */
public class SilverOre extends Block {
	/** コントストラクタ. */
	public SilverOre() {
		super(Material.rock);
		setUnlocalizedName("silver_ore");
	}
}