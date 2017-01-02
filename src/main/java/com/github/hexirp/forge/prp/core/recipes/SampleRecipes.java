package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.Library;
import com.github.hexirp.forge.Recipe;
import com.github.hexirp.forge.recipe.builder.ProductPhase;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

/**
 * サンプルで追加されるレシピ.
 *
 * @author Hexirp
 */
public class SampleRecipes extends Library implements Recipe {
	@Override
	protected void add() {
		library.add(new ProductPhase(Blocks.bedrock, 1).order()
		    .add("AAA")
		    .add("AAA")
		    .add("AAA").map()
		    .put('A', Blocks.obsidian)
		    .toRecipe());
		
		library.add(new ProductPhase(Items.chainmail_helmet, 1).order()
		    .add(" A ")
		    .add("A A").map()
		    .put('A', Items.iron_ingot)
		    .toRecipe());
		
		library.add(new ProductPhase(Blocks.bedrock, 1).material()
		    .add(Blocks.obsidian, 3)
		    .toRecipe());
	}
}
