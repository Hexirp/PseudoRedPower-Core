package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.ItemIndex;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.smelting.SmeltingRecipe;
import com.github.hexirp.forge.smelting.SmeltingRecipeExp;
import com.github.hexirp.forge.smelting.SmeltingRecipeInga;

import net.minecraft.init.Items;

/**
 * PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムの索引
	 */
	public Smeltings(ItemIndex items) {
		super(items);
	}
	
	@Override
	protected void add(ItemIndex index) {
		library
		    .add(
		        new SmeltingRecipe(
		            new SmeltingRecipeInga(
		                Items.carrot,
		                Items.coal),
		            new SmeltingRecipeExp(10, 1)));
	}
}
