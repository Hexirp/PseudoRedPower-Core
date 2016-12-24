package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.RecipeLibrary;
import com.github.hexirp.forge.recipe.RecipeProduct;
import com.github.hexirp.forge.recipe.ShapedRecipe;
import com.github.hexirp.forge.recipe.ShapedRecipeAbstractOrder;
import com.github.hexirp.forge.recipe.ShapedRecipeMaterialMap;
import com.github.hexirp.forge.recipe.ShapedRecipeOrder;
import com.github.hexirp.forge.recipe.ShapelessRecipe;
import com.github.hexirp.forge.recipe.ShapelessRecipeMaterial;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

/**
 * サンプルで追加されるレシピ.
 *
 * @author Hexirp
 */
@SuppressWarnings("serial")
public class SampleRecipes extends RecipeLibrary {
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public SampleRecipes() {
		super();
	}
	
	/** ライブラリにレシピ群を追加する */
	@Override
	public void add() {
		this
		    ._add(new ShapedRecipe(
		        new RecipeProduct(Blocks.bedrock, 1),
		        new ShapedRecipeOrder(
		            new ShapedRecipeAbstractOrder()
		                .add("AAA")
		                .add("AAA")
		                .add("AAA"),
		            new ShapedRecipeMaterialMap()
		                .put('A', Blocks.obsidian))))
		    ._add(new ShapedRecipe(
		        new RecipeProduct(Items.chainmail_helmet, 1),
		        new ShapedRecipeOrder(
		            new ShapedRecipeAbstractOrder()
		                .add(" A ")
		                .add("A A"),
		            new ShapedRecipeMaterialMap()
		                .put('A', Items.iron_ingot))))
		    ._add(new ShapelessRecipe(
		        new RecipeProduct(Blocks.bedrock, 1),
		        new ShapelessRecipeMaterial()
		            .add(Blocks.obsidian, 3)));
	}
}
