package com.github.hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import com.github.hexirp.ListUtil;
import com.github.hexirp.forge.MinecraftItem;

import net.minecraft.item.Item;

/**
 * 不定形レシピの材料を表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipeMaterial {
	/** 不定形レシピの材料. */
	private final List<Item> list = new LinkedList<>();
	
	/**
	 * 配列に変換する.
	 *
	 * @return 材料の配列
	 */
	public Object[] calc() {
		return new ListUtil<>(list).to();
	}
	
	/**
	 * 材料を追加する.
	 *
	 * @param obj 材料の種類
	 * @param n 材料の個数。0以上でなければならない
	 * @return メソッドチェーン用
	 */
	public ShapelessRecipeMaterial add(final MinecraftItem obj, final int n) {
		for (int india = 0; india < n; india++)
			list.add(obj.get());
		
		return this;
	}
}