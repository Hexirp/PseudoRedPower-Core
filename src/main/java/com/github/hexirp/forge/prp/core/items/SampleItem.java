package com.github.hexirp.forge.prp.core.items;

import com.github.hexirp.Named;
import com.github.hexirp.forge.Loadable;
import com.github.hexirp.forge.item.LoadableItem;

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
		setUnlocalizedName(this.name());
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String name() {
		return "sample_item";
	}
	
	/**
	 * ロードが可能であるようにする.
	 *
	 * @return ロード可能なアイテム
	 */
	public Loadable toLoadable() {
		return new LoadableItem(this);
	}
}
