package hexirp.forge.prp.core;

import hexirp.annotation.Method.Setting;
import hexirp.collection.Pair;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.recipe.builder.RecipeBuilder;
import net.minecraft.init.Items;

/**
 * チェーンメイルを作成するためのレシピを定義する.
 *
 * @author Hexirp
 */
public class ChainMail extends RegisterableLibrary {
	/** 初期化する. */
	@Setting
	public ChainMail() {
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_helmet))
		        .to(1)
		        .to(Unit.$())
		        .set(" A ")
		        .set("A A")
		        .to(Unit.$())
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to(Unit.$()));
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_chestplate))
		        .to(1)
		        .to(Unit.$())
		        .set("A A")
		        .set(" A ")
		        .set("AAA")
		        .to(Unit.$())
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to(Unit.$()));
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_leggings))
		        .to(1)
		        .to(Unit.$())
		        .set(" A ")
		        .set("A A")
		        .set("A A")
		        .to(Unit.$())
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to(Unit.$()));
		add(
		    new RecipeBuilder()
		        .to(new MinecraftItem(Items.chainmail_boots))
		        .to(1)
		        .to(Unit.$())
		        .set("A  ")
		        .set("  A")
		        .to(Unit.$())
		        .set(new Pair<>('A', new MinecraftItem(Items.iron_ingot)))
		        .to(Unit.$()));
	}
}
