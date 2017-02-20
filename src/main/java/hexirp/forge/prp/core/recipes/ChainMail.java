package hexirp.forge.prp.core.recipes;

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
		        .product(new MinecraftItem(Items.chainmail_helmet), 1)
		        .order()
		        .add(" A ")
		        .add("A A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product(new MinecraftItem(Items.chainmail_chestplate), 1)
		        .order()
		        .add("A A")
		        .add(" A ")
		        .add("AAA")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product(new MinecraftItem(Items.chainmail_leggings), 1)
		        .order()
		        .add(" A ")
		        .add("A A")
		        .add("A A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
		add(
		    new RecipeBuilder()
		        .product(new MinecraftItem(Items.chainmail_boots), 1)
		        .order()
		        .add("A  ")
		        .add("  A")
		        .to()
		        .put('A', new MinecraftItem(Items.iron_ingot))
		        .to());
	}
}