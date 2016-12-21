package com.github.hexirp.minecraft.recipe;

import java.util.LinkedList;
import java.util.List;

/**
 * このクラスはレシピの並べ方を文字で抽象的に表現する.
 *
 * 実際にはメソッドチェーンを使用するためにList<String>を包むクラスである。
 *
 * <pre>
 * new ShapedRecipeAbstractOrder()
 *     .add("AAA")
 *     .add("AAA")
 *     .add("AAA")
 * </pre>
 *
 * @author Hexirp
 */
public class ShapedRecipeAbstractOrder {
	/** 文字で表現されたレシピの並べ方. */
	private final List<String> order;
	
	/** コントストラクタ. */
	public ShapedRecipeAbstractOrder() {
		this.order = new LinkedList<String>();
	}
	
	/**
	 * 文字で表現されたレシピの並べ方を返す.
	 */
	public List<String> order() {
		return order;
	}
	
	/**
	 * レシピの下側に行を追加する.
	 *
	 * @param string 追加される文字列
	 */
	public ShapedRecipeAbstractOrder add(String string) {
		order.add(string);
		
		return this;
	}
}
