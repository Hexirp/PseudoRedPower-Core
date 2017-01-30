package com.github.hexirp.forge;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * MODにおいて追加される要素を保持する辞書を表現する.
 *
 * 何かを追加するクラスを抽象化したクラス群の共通部分を取り出すことにより作成された。
 *
 * @author Hexirp
 * @param <Element> 要素の型
 */
public class Library<Element> {
	/** 内部に保持され、辞書として扱われるリスト. */
	private final List<Element> library = new LinkedList<>();
	
	/**
	 * 値を追加する.
	 *
	 * @param element 追加される要素
	 * @return メソッドチェーン用
	 * @see java.util.Collection#add(Object)
	 */
	public Library<Element> add(Element element) {
		library.add(element);
		return this;
	}
	
	/**
	 * 全ての要素に操作を適用する.
	 *
	 * @param action 一つの引数を取り、結果を返さない操作
	 * @see java.lang.Iterable#forEach(Consumer)
	 */
	public void forEach(Consumer<? super Element> action) {
		library.forEach(action);
	}
}