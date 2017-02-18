package hexirp.forge.prp.core;

import hexirp.forge.Index;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.recipe.builder.RecipeBuilder;

/**
 * PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムのリスト
	 */
	public Smeltings(final Index<MinecraftItem> items) {
		add(
		    new RecipeBuilder()
		        .inga(items.lookup("silver_ingot"), items.lookup("silver_ore"))
		        .exp(1, 1)
		        .to());
	}
}