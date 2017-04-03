package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.collection.Pair;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.recipe.builder.RecipeBuilder;
import net.minecraft.init.Items;

/**
 * チェーンメイルを作成するためのレシピを定義する.
 *
 * @author Hexirp
 */
public final class ChainMail extends RegisterableLibrary {
	/** 初期化する. */
	@Setting
	public ChainMail() {
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_helmet))
		        .to(1)
		        .to()
		        .set(" A ")
		        .set("A A")
		        .to()
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to());
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_chestplate))
		        .to(1)
		        .to()
		        .set("A A")
		        .set(" A ")
		        .set("AAA")
		        .to()
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to());
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_leggings))
		        .to(1)
		        .to()
		        .set(" A ")
		        .set("A A")
		        .set("A A")
		        .to()
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to());
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_boots))
		        .to(1)
		        .to()
		        .set("A  ")
		        .set("  A")
		        .to()
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to());
	}
}
