package com.github.hexirp.minecraft.recipe;

import java.util.LinkedList;
import java.util.List;

/**
 * このクラスは文字で抽象的に表現された並べ方とその文字とアイテムとの対応関係を合わせてレシピの並べ方を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeOrder {
	/** 文字で抽象的に表現された並べ方 */
	private final ShapedRecipeAbstractOrder order;
	
	/** 文字とアイテムとの対応関係 */
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
	 * レシピの並べ方をリストへ変換する.
	 */
	public Object[] calc() {
		List<Object> ret = append(
		    order.order(),
		    input.toList());
			
		return ret.toArray();
	}
	
	/**
	 * 二つのリストを結合する関数.それらの値の型は異なっても良いし、同じでもよい。
	 *
	 * @param a どのような型を要素としていても良い
	 * @param b どのような型を要素としていても良い
	 * @return 二つの引数の値の型が共通して継承する型を型引数とするリスト型
	 */
	private <A, B extends A, C extends A> List<A> append(List<B> a, List<C> b) {
		List<A> ret = new LinkedList<A>();
		
		a.forEach(t -> ret.add(t));
		
		b.forEach(t -> ret.add(t));
		
		return ret;
	}
}
