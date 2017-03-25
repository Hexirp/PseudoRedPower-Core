package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.collection.Pair;
import hexirp.forge.Index;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.prp.core.ore.SilverBlock;
import hexirp.forge.prp.core.ore.SilverIngot;
import hexirp.forge.prp.core.ore.SilverOre;
import hexirp.forge.recipe.builder.RecipeBuilder;

/**
 * PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class OreRecipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムのリスト
	 */
	@Setting
	public OreRecipes(final Index<MinecraftItem> items) {
		add(
		    new RecipeBuilder()
		        .to2(items.lookup(new SilverIngot().name()))
		        .to(items.lookup(new SilverOre().name()))
		        .to(1)
		        .to(1)
		        .to());
		add(new RecipeBuilder()
		    .to(items.lookup(new SilverBlock().name()))
		    .to(1)
		    .to()
		    .set("AAA")
		    .set("AAA")
		    .set("AAA")
		    .to()
		    .set(new Pair<>('A', items.lookup(new SilverIngot().name())))
		    .to());
		add(new RecipeBuilder()
		    .to(items.lookup(new SilverIngot().name()))
		    .to(9)
		    .to()
		    .set("A")
		    .to()
		    .set(new Pair<>('A', items.lookup(new SilverBlock().name())))
		    .to());
	}
}
