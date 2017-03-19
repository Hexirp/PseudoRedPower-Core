package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.collection.Unit;
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
	@Setting
	public OresRecipes(final Index<MinecraftItem> items) {
		add(
		    new RecipeBuilder()
		        .to2(items.lookup("silver_ingot"))
		        .to(items.lookup("silver_ore"))
		        .to(1)
		        .to(1)
		        .to(Unit.$()));
	}
}
