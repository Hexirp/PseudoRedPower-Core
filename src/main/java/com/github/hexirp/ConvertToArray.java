package com.github.hexirp;

/**
 * 配列への変換を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public class ConvertToArray<Element> {
	/** 内部に保持するリスト. */
	private final java.util.List<Element> list;
	
	/**
	 * Setter.
	 *
	 * @param list リスト
	 */
	public ConvertToArray(final java.util.List<Element> list) {
		this.list = list;
	}
	
	/**
	 * 配列に変換する.
	 *
	 * @return 配列に変換されたリスト
	 */
	public Object[] to() {
		final Object[] ret = list.toArray();
		if (null == ret) throw new NullPointerException();
		else return ret;
	}
}