package com.github.hexirp.forge.recipe;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import com.github.hexirp.forge.item.MinecraftItem;

/**
 * {@link ShapedRecipeAbstractOrder}における文字とアイテムとの対応関係を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeMaterialMap {
	/** 文字とアイテムとの対応関係. */
	private final LinkedHashMap<Character, MinecraftItem> material = new LinkedHashMap<Character, MinecraftItem>();
	
	/**
	 * 文字とアイテムとの対応関係を{@link List}に変換する.
	 *
	 * @return 対応関係がリストで表現されたもの
	 */
	public final List<Object> toList() {
		final List<Object> ret = new LinkedList<Object>();
		
		material.forEach((final Character key, final MinecraftItem value) -> {
			if (null == key) throw new NullPointerException();
			ret.add(key);
			ret.add(value.get());
		});
		
		return ret;
	}
	
	/**
	 * 対応関係を追加する.
	 *
	 * @param key アルファベット大文字
	 * @param value アイテム
	 * @return メソッドチェーン用
	 */
	public ShapedRecipeMaterialMap put(final Character key, final MinecraftItem value) {
		material.put(key, value);
		
		return this;
	}
}
