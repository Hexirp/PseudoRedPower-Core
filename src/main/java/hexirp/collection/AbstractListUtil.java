package hexirp.collection;

import java.util.Collection;
import java.util.List;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;

/**
 * 配列への変換を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public abstract class AbstractListUtil<Element> implements UsingList<Element> {
	/** 内部に保持するリスト. */
	private final List<Element> list = usedList();
	
	/**
	 * @return 配列に変換されたリスト
	 */
	@Getting
	public Object[] array() {
		final Object[] ret = list.toArray();
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
	public AbstractListUtil<Element> merge(final Collection<? extends Element> col) {
		list.addAll(col);
		return this;
	}
}
