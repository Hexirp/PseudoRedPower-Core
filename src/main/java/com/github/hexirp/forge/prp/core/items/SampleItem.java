package com.github.hexirp.forge.prp.core.items;

import com.github.hexirp.Named;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 無機能アイテムのサンプル.
 *
 * @author Hexirp
 */
public class SampleItem extends Item implements Named {
	/** コントストラクタ. */
	public SampleItem() {
		super();
		this
		    .setUnlocalizedName(name())
		    .setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String name() {
		return "sample_item";
	}
}
