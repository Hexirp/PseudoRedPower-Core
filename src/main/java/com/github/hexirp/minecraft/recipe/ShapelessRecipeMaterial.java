package com.github.hexirp.minecraft.recipe;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

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
	
	/** 不定形レシピの材料を配列に変換する */
	public Object[] calc() {
		return list.toArray();
	}
	
	/**
	 * 不定形レシピの材料リストに追加する.
	 *
	 * @param obj ItemクラスとBlockクラスのみが渡されるべきである
	 * @param n 個数
	 */
	public ShapelessRecipeMaterial add(Object obj, int n) {
		repeat(list::add, obj, n);
		
		return this;
	}
	
	/**
	 * 返り値を返さない操作を引数に複数回適用する.
	 *
	 * @param action 返り値を返さない操作
	 * @param arg 引数
	 * @param times 回数
	 */
	private <T> void repeat(Consumer<T> action, T arg, int times) {
		for (int counter = 0; counter < times; counter++) {
			action.accept(arg);
		}
	}
}
