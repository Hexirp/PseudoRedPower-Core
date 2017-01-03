package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.Library;
import com.github.hexirp.forge.Recipe;
import com.github.hexirp.forge.item.MinecraftItem;
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
		library.add(new ProductPhase(new MinecraftItem(Blocks.bedrock), 1).order()
		    .add("AAA")
		    .add("AAA")
		    .add("AAA").map().put('A', new MinecraftItem(Blocks.bedrock))
		    .toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_helmet), 1).order()
		    .add(" A ")
		    .add("A A").map().put('A', new MinecraftItem(Items.iron_ingot))
		    .toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_chestplate), 1).order()
		    .add("A A")
		    .add(" A ")
		    .add("AAA").map().put('A', new MinecraftItem(Items.iron_ingot))
		    .toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_leggings), 1).order()
		    .add(" A ")
		    .add("A A")
		    .add("A A").map().put('A', new MinecraftItem(Items.iron_ingot))
		    .toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_boots), 1).order()
		    .add("A  ")
		    .add("  A").map().put('A', new MinecraftItem(Items.iron_ingot))
		    .toRecipe());
	}
}
