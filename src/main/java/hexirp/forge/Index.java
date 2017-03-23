package hexirp.forge;

import java.util.HashMap;
import java.util.Map;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.OneField;

/**
 * アイテムの索引を表す.
 *
 * @author Hexirp
 * @param <Item> 項目
 */
public class Index<Item> extends OneField<Map<String, Item>> {
	/** Setting. */
	@Setting
	public Index() {
		super(new HashMap<String, Item>());
	}
	
	/**
	 * 索引を結合する.
	 *
	 * @param i 索引
	 * @return this
	 */
	@Chaining
	public Index<Item> merge(final Index<? extends Item> i) {
		value.putAll(i.value);
		return this;
	}
	
	/**
	 * 索引に要素を追加する.
	 *
	 * @param s 索引の見出し
	 * @param i 索引の本文
	 * @return this
	 */
	@Chaining
	public Index<Item> put(final String s, final Item i) {
		value.put(s, i);
		return this;
	}
	
	/**
	 * @param string 索引の見出し
	 * @return 索引の本文
	 */
	@Getting
	public Item lookup(final String string) {
		return value.get(string);
	}
}
