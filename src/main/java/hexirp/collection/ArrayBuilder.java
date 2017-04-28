package hexirp.collection;

import java.util.Collection;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;

/**
 * 配列への変換を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public class ArrayBuilder<Element> extends LinkedListUser<Element> {
	/**
	 * @return 配列に変換されたリスト
	 */
	@Getting
	public Object[] array() {
		final Object[] ret = value.toArray();
		if (null == ret) throw null;
		return ret;
	}
	
	/**
	 * リストを結合する.
	 *
	 * @param col コレクション
	 * @return this
	 */
	@Chaining
	public ArrayBuilder<Element> merge(final Collection<? extends Element> col) {
		value.addAll(col);
		return this;
	}
}
