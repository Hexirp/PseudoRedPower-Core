package hexirp.forge;

import java.util.HashMap;
import java.util.Map;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;

/**
 * アイテムの索引を表す.
 *
 * @author Hexirp
 * @param <Item> 項目
 */
public class Index<Item> {
	/** 索引. */
	private final Map<String, Item> index = new HashMap<>();

	/**
	 * 索引を結合する.
	 *
	 * @param i 索引
	 * @return メソッドチェーン用
	 */
	@Chaining
	public Index<Item> merge(final Index<? extends Item> i) {
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
	@Chaining
	public Index<Item> put(final String s, final Item i) {
		index.put(s, i);
		return this;
	}

	/**
	 * 索引を引く.
	 *
	 * @param string 索引の見出し
	 * @return 索引の本文
	 */
	@Getting
	public Item lookup(final String string) {
		return index.get(string);
	}
}
