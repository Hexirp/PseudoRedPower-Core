package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.prp.core.recipes.ChainMail;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
	public Recipes(Index<MinecraftItem> items) {
		library
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Blocks.bedrock), 1)
		            .order()
		            .add("AAA")
		            .add("AAA")
		            .add("AAA")
		            .to()
		            .put('A', items.get("sample_item"))
		            .to())
		    .add(new ChainMail())
		    .add(new Smeltings())
		    .add(() -> GameRegistry.addRecipe(
		        new ItemStack(Blocks.bedrock),
		        "A",
		        'A',
		        Blocks.bedrock)); //test
	}
}
