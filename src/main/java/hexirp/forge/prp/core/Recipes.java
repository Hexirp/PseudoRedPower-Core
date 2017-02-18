package hexirp.forge.prp.core;

import hexirp.forge.Index;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.prp.core.recipes.ChainMail;
import hexirp.forge.prp.core.recipes.SampleRecipe;

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
		add(new SampleRecipe(items));
		add(new ChainMail());
		add(new Smeltings(items));
	}
}