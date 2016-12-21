package com.github.hexirp.minecraft.prp.core;

import com.github.hexirp.minecraft.recipe.RecipeProduct;
import com.github.hexirp.minecraft.recipe.RecipeRegistration;
import com.github.hexirp.minecraft.recipe.ShapedRecipe;
import com.github.hexirp.minecraft.recipe.ShapedRecipeAbstractOrder;
import com.github.hexirp.minecraft.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.minecraft.recipe.ShapedRecipeOrder;
import com.github.hexirp.minecraft.recipe.ShapelessRecipe;
import com.github.hexirp.minecraft.recipe.ShapelessRecipeMaterial;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

/**
 * このクラスは、PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipe {
	/**
	 * Recipe群を追加する.
	 */
	static final void add() {
		RecipeRegistration.addShapedRecipe(new ShapedRecipe(
		    new RecipeProduct(Blocks.bedrock, 1),
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder()
		            .add("AAA")
		            .add("AAA")
		            .add("AAA"),
		        new ShapedRecipeMaterialMap()
		            .put('A', Blocks.obsidian))));
					
		RecipeRegistration.addShapedRecipe(new ShapedRecipe(
		    new RecipeProduct(Items.chainmail_helmet, 1),
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder()
		            .add(" A ")
		            .add("A A"),
		        new ShapedRecipeMaterialMap()
		            .put('A', Items.iron_ingot))));
					
		RecipeRegistration.addShapelessRecipe(new ShapelessRecipe(
		    new RecipeProduct(Blocks.bedrock, 1),
		    new ShapelessRecipeMaterial()
		        .add(Blocks.obsidian, 3)));
	}
}
