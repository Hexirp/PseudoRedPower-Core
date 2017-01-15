package com.github.hexirp.forge;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;

/**
 * アイテムの索引を表す.
 *
 * @author Hexirp
 */
public class ItemIndex {
	/** 索引. */
	private final Map<String, Item> index = new HashMap<>();
	
	/**
	 * 索引を結合する.
	 *
	 * @param i 索引
	 * @return メソッドチェーン用
	 */
	public ItemIndex merge(ItemIndex i) {
		index.putAll(i.index);
		return this;
	}
	
	/**
	 * 索引に要素を追加する.
	 *
	 * @param s 索引の見出し
	 * @param i 索引の本文
	 * @return メソッドチェーン用
	 */
	public ItemIndex put(String s, Item i) {
		index.put(s, i);
		return this;
	}
	
	/**
	 * 索引を引く.
	 *
	 * @param string 索引の見出し
	 * @return 索引の本文
	 */
	public Item get(String string) {
		return index.get(string);
	}
}
