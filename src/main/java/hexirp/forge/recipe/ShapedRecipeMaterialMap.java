package hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.collection.HashMapUser;
import hexirp.forge.MinecraftItem;

/**
 * {@link ShapedRecipeAbstractOrder}における文字とアイテムとの対応関係を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeMaterialMap extends HashMapUser<Character, MinecraftItem> {
	/**
	 * @return 対応関係がリストで表現されたもの
	 */
	@Getting
	public final List<Object> list() {
		final List<Object> ret = new LinkedList<Object>();
		
		value.forEach((final Character key, final MinecraftItem value) -> {
			if (null == key || null == value) throw null;
			ret.add(key);
			ret.add(value.item());
		});
		
		return ret;
	}
	
	/**
	 * 対応関係を追加する.
	 *
	 * @param c アルファベット大文字
	 * @param i アイテム
	 * @return this
	 */
	@Chaining
	public ShapedRecipeMaterialMap put(final Character c, final MinecraftItem i) {
		value.put(c, i);
		return this;
	}
}
