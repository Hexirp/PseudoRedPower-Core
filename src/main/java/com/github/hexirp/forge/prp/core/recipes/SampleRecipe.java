package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.recipe.builder.RecipeBuilder;

import net.minecraft.init.Blocks;

// TODO:試験的コード
/**
 * サンプルレシピを表現する.
 *
 * @author Hexirp
 */
public class SampleRecipe extends RegisterableLibrary {
	/**
	 * アイテムをセットする.
	 *
	 * @param index アイテムの索引
	 */
	public SampleRecipe(final Index<MinecraftItem> index) {
		library
		    .add(
		        new RecipeBuilder()
		            .product(new MinecraftItem(Blocks.bedrock), 1)
		            .order()
		            .add("AAA")
		            .add("AAA")
		            .add("AAA")
		            .to()
		            .put('A', index.get("silver_ingot"))
		            .to());
	}
}