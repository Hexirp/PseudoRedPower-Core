package com.github.hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import com.github.hexirp.forge.item.MinecraftItem;

/**
 * 不定形レシピの材料を表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipeMaterial {
	// TODO: List<Object>をList<MinecraftItem>に変更する
	/** 不定形レシピの材料. */
	private final List<Object> list = new LinkedList<>();
	
	// FIXME: MinecraftItem.get()が行われないミスが存在
	/**
	 * 配列に変換する.
	 *
	 * @return 材料の配列
	 */
	public Object[] calc() {
		return list.toArray();
	}
	
	/**
	 * 材料を追加する.
	 *
	 * @param obj 材料の種類
	 * @param n 材料の個数。0以上でなければならない
	 * @return メソッドチェーン用
	 */
	public ShapelessRecipeMaterial add(MinecraftItem obj, int n) {
		if (false == 0 <= n) throw new IllegalArgumentException();
		
		for (int counter = 0; counter < n; counter++) {
			list.add(obj);
		}
		
		return this;
	}
}
