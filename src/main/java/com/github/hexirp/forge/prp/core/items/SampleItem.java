package com.github.hexirp.forge.prp.core.items;

import com.github.hexirp.Named;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * サンプルアイテムを定義する.
 *
 * @author Hexirp
 */
public class SampleItem extends Item implements Named {
	/** コントストラクタ. */
	public SampleItem() {
		super();
		this.setUnlocalizedName(this.name()).setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String name() {
		return "sample_item";
	}
}
