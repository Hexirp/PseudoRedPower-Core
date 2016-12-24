package com.github.hexirp.forge.recipe;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * このクラスは文字とアイテムとの対応関係を表現する.
 *
 * 実際にはメソッドチェーンを使用するために{@code Map<Character, Object>}を包むクラスである。
 *
 * @author Hexirp
 */
public class ShapedRecipeMaterialMap {
	/** 文字とアイテムとの対応関係. */
	private final Map<Character, Object> material;
	
	/** コントストラクタ. */
	public ShapedRecipeMaterialMap() {
		material = new LinkedHashMap<Character, Object>();
	}
	
	/**
	 * 文字とアイテムとの対応関係を{@code List<Object>}に変換する.
	 *
	 * @return 対応関係がリストで表現されたもの
	 */
	public final List<Object> toList() {
		List<Object> ret = new LinkedList<Object>();
		
		material.forEach((Character key, Object value) -> {
			ret.add(key);
			ret.add(value);
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
	public ShapedRecipeMaterialMap put(Character key, Object value) {
		material.put(key, value);
		
		return this;
	}
}
