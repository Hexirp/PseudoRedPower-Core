package hexirp.collection;

import java.util.Collection;

/**
 * 配列への変換を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public class ListUtil<Element> {
	/** 内部に保持するリスト. */
	private final java.util.List<Element> list;
	
	/**
	 * Setter.
	 *
	 * @param list リスト
	 */
	public ListUtil(final java.util.List<Element> list) {
		this.list = list;
	}
	
	/**
	 * 配列に変換する.
	 *
	 * @return 配列に変換されたリスト
	 */
	public Object[] array() {
		final Object[] ret = list.toArray();
		if (null == ret) throw null;
		return ret;
	}
	
	/**
	 * リストを結合する.
	 * .
	 *
	 * @param col コレクション
	 * @return 自分自身
	 */
	public ListUtil<Element> merge(final Collection<? extends Element> col) {
		list.addAll(col);
		return this;
	}
}