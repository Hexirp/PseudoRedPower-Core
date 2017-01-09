package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.Registerable;
import com.github.hexirp.forge.RegisterableLibrary;
import com.github.hexirp.forge.item.MinecraftItem;
import com.github.hexirp.forge.recipe.builder.ProductPhase;

import net.minecraft.init.Items;

/**
 * チェーンメイルのレシピ.
 *
 * @author Hexirp
 */
public class ChainMailRecipes extends RegisterableLibrary implements Registerable {
	@Override
	protected void add() {
		upper();
		lower();
	}
	
	/** 上半身. */
	private void lower() {
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_leggings), 1).order()
		    .add(" A ")
		    .add("A A")
		    .add("A A").map().put('A', new MinecraftItem(Items.iron_ingot)).toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_boots), 1).order()
		    .add("A  ")
		    .add("  A").map().put('A', new MinecraftItem(Items.iron_ingot)).toRecipe());
	}
	
	/** 下半身. */
	private void upper() {
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_helmet), 1).order()
		    .add(" A ")
		    .add("A A").map().put('A', new MinecraftItem(Items.iron_ingot)).toRecipe());
		
		library.add(new ProductPhase(new MinecraftItem(Items.chainmail_chestplate), 1).order()
		    .add("A A")
		    .add(" A ")
		    .add("AAA").map().put('A', new MinecraftItem(Items.iron_ingot)).toRecipe());
	}
}