package com.github.hexirp.forge.recipe;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import com.github.hexirp.forge.item.MinecraftItem;

/**
 * このクラスは文字とアイテムとの対応関係を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeMaterialMap {
	/** 文字とアイテムとの対応関係. */
	private final LinkedHashMap<Character, MinecraftItem> material = new LinkedHashMap<Character, MinecraftItem>();
	
	/**
	 * 文字とアイテムとの対応関係を{@code List<Object>}に変換する.
	 *
	 * @return 対応関係がリストで表現されたもの
	 */
	public final List<Object> toList() {
		List<Object> ret = new LinkedList<Object>();
		
		material.forEach((Character key, MinecraftItem value) -> {
			ret.add(key);
			ret.add(value.get());
		});
		
		return ret;
	}
	
	/**
	 * 対応関係を追加する.
	 *
	 * @param key 単一文字
	 * @param value ItemクラスとBlockクラスのみが渡されるべきである
	 * @return 自分自身
	 */
	public ShapedRecipeMaterialMap put(Character key, MinecraftItem value) {
		material.put(key, value);
		
		return this;
	}
}
