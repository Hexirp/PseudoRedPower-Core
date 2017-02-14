package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.prp.core.recipes.ChainMail;
import com.github.hexirp.forge.prp.core.recipes.SampleRecipe;

/**
 * PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムの索引
	 */
	public Recipes(final Index<MinecraftItem> items) {
		library
		    .add(new SampleRecipe(items))
		    .add(new ChainMail())
		    .add(new Smeltings(items));
	}
}