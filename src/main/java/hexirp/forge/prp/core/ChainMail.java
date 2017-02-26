package hexirp.forge.prp.core;

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
	public ChainMail() {
		add(
		    new RecipeBuilder()
		        .product()
		        .apply(new MinecraftItem(Items.chainmail_helmet))
		        .apply(1)
		        .order()
		        .add(" A ")
		        .add("A A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product()
		        .apply(new MinecraftItem(Items.chainmail_chestplate))
		        .apply(1)
		        .order()
		        .add("A A")
		        .add(" A ")
		        .add("AAA")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product()
		        .apply(new MinecraftItem(Items.chainmail_leggings))
		        .apply(1)
		        .order()
		        .add(" A ")
		        .add("A A")
		        .add("A A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product()
		        .apply(new MinecraftItem(Items.chainmail_boots))
		        .apply(1)
		        .order()
		        .add("A  ")
		        .add("  A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
	}
}
