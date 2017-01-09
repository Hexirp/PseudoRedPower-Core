package com.github.hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

/**
 * このクラスは文字で抽象的に表現された並べ方とその文字とアイテムとの対応関係を合わせてレシピの並べ方を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeOrder {
	/** 文字で抽象的に表現された並べ方. */
	private final ShapedRecipeAbstractOrder order;
	
	/** 文字とアイテムとの対応関係. */
	private final ShapedRecipeMaterialMap input;
	
	/**
	 * コントストラクタ.
	 *
	 * @param order 文字で抽象的に表現された並べ方
	 * @param input 文字とアイテムとの対応関係
	 */
	public ShapedRecipeOrder(ShapedRecipeAbstractOrder order, ShapedRecipeMaterialMap input) {
		this.order = order;
		this.input = input;
	}
	
	/**
	 * レシピの並べ方を配列へ変換する.
	 *
	 * @return レシピの並べ方の配列での表現
	 */
	public Object[] calc() {
		List<Object> ret = new LinkedList<>();
		
		order.order().forEach(ret::add);
		
		input.toList().forEach(ret::add);
		
		return ret.toArray();
	}
}
