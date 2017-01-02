package com.github.hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

/**
 * このクラスは不定形レシピの材料を表現する.
 *
 * 実際にはメソッドチェーンを使用するために{@code List<Object>}を包むクラスである。
 *
 * @author Hexirp
 */
public class ShapelessRecipeMaterial {
	/** 不定形レシピの材料 */
	private final List<Object> list;
	
	/** コントストラクタ */
	public ShapelessRecipeMaterial() {
		list = new LinkedList<Object>();
	}
	
	/**
	 * 不定形レシピの材料を配列に変換する
	 *
	 * @return 材料の配列での表
	 */
	public Object[] calc() {
		return list.toArray();
	}
	
	/**
	 * 不定形レシピの材料リストに追加する.
	 *
	 * @param obj ItemクラスとBlockクラスのみが渡されるべきである
	 * @param n 個数
	 * @return 自分自身
	 */
	public ShapelessRecipeMaterial add(Object obj, int n) {
		if (0 <= n == false) throw new IllegalArgumentException();
		
		for (int counter = 0; counter < n; counter++) {
			list.add(obj);
		}
		
		return this;
	}
}
