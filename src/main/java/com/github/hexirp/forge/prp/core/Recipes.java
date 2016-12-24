package com.github.hexirp.forge.prp.core;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;

import com.github.hexirp.forge.Registerable;
import com.github.hexirp.forge.recipe.Recipe;
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
 * このクラスは、PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes implements Registerable {
	/** レシピ群. */
	private final Collection<Recipe> library = new LinkedList<>();
	
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public Recipes() {
		add();
	}
	
	/**
	 * ゲームにRecipe群を追加する.
	 */
	@Override
	public void register() {
		final Consumer<Recipe> register = (Recipe recipe) -> {
			recipe.register();
		};
		
		library.forEach(register);
	}
	
	/** ライブラリにレシピ群を追加する */
	private void add() {
		library.add(new ShapedRecipe(
		    new RecipeProduct(Blocks.bedrock, 1),
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder()
		            .add("AAA")
		            .add("AAA")
		            .add("AAA"),
		        new ShapedRecipeMaterialMap()
		            .put('A', Blocks.obsidian))));
					
		library.add(new ShapedRecipe(
		    new RecipeProduct(Items.chainmail_helmet, 1),
		    new ShapedRecipeOrder(
		        new ShapedRecipeAbstractOrder()
		            .add(" A ")
		            .add("A A"),
		        new ShapedRecipeMaterialMap()
		            .put('A', Items.iron_ingot))));
					
		library.add(new ShapelessRecipe(
		    new RecipeProduct(Blocks.bedrock, 1),
		    new ShapelessRecipeMaterial()
		        .add(Blocks.obsidian, 3)));
	}
}
