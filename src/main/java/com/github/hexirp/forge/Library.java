package com.github.hexirp.forge;

import java.util.LinkedList;
import java.util.List;

/**
 * MOD内で追加されるレシピやアイテムを定義するクラスの抽象化.
 *
 * @author Hexirp
 */
public class Library implements Registerable {
	/**
	 * 保持する辞書.
	 */
	protected final List<Recipe> library = new LinkedList<Recipe>();
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
	
}