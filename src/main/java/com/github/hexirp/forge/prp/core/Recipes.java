package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Library;
import com.github.hexirp.forge.Recipe;
import com.github.hexirp.forge.prp.core.recipes.SampleRecipes;

/**
 * このクラスは、PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes extends Library implements Recipe {
	@Override
	protected void add() {
		library.add(new SampleRecipes());
	}
}
