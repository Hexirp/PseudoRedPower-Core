package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
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
public final class OreRecipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 *
	 * @param items アイテムのリスト
	 */
	@Setting
	public OreRecipes(final Index<MinecraftItem> items) {
		add(new RecipeBuilder()
		    .to2(new SilverIngot().find(items))
		    .to(new SilverOre().find(items))
		    .to(1)
		    .to(1)
		    .to());
		add(new RecipeBuilder()
		    .to(new SilverBlock().find(items))
		    .to(1)
		    .to()
		    .set("AAA")
		    .set("AAA")
		    .set("AAA")
		    .to()
		    .set('A', new SilverIngot().find(items))
		    .to());
		add(new RecipeBuilder()
		    .to(new SilverIngot().find(items))
		    .to(9)
		    .to()
		    .set("A")
		    .to()
		    .set('A', new SilverBlock().find(items))
		    .to());
	}
}
