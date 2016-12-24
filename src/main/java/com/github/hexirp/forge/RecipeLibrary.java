package com.github.hexirp.forge;

import java.util.LinkedList;

/**
 * レシピ群を定義する.
 *
 * @author Hexirp
 */
@SuppressWarnings("serial")
public abstract class RecipeLibrary extends LinkedList<Recipe> implements Recipe {
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public RecipeLibrary() {
		super();
		add();
	}
	
	/**
	 * ゲームにRecipe群を追加する.
	 */
	@Override
	public void register() {
		this.forEach(recipe -> recipe.register());
	}
	
	/** ライブラリにレシピ群を追加する */
	public abstract void add();
	
	/**
	 * メソッドチェーン可能な追加メソッド.
	 *
	 * @param recipe 追加する値
	 * @return 自分自身
	 */
	public RecipeLibrary _add(Recipe recipe) {
		this.add(recipe);
		
		return this;
	}
}