package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.LoadableLibrary;
import com.github.hexirp.forge.item.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items extends LoadableLibrary {
	@Override
	protected void add() {
		library.add(new ModItem(
		    "sample_item",
		    new Item()
		        .setCreativeTab(CreativeTabs.tabMaterials)));
	}
}
