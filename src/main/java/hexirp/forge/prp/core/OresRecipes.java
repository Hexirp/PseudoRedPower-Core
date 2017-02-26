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
public class OresRecipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムのリスト
	 */
	public OresRecipes(final Index<MinecraftItem> items) {
		add(
		    new RecipeBuilder()
		        .smelting()
		        .apply(items.lookup("silver_ingot"))
		        .apply(items.lookup("silver_ore"))
		        .apply(1)
		        .apply(1));
	}
}
