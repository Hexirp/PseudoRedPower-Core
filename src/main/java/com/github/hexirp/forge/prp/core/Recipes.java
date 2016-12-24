package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.RecipeLibrary;
import com.github.hexirp.forge.prp.core.recipes.SampleRecipes;

/**
 * このクラスは、PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
@SuppressWarnings("serial")
public class Recipes extends RecipeLibrary {
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public Recipes() {
		super();
	}
	
	@Override
	public void add() {
		this.addAll(new SampleRecipes());
	}
}
