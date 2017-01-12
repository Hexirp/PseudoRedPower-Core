package com.github.hexirp.forge;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Hexirp
 *
 * @param <E> 要素
 */
public class Library<E> {
	/** 保持するリスト. */
	private final List<E> library = new LinkedList<>();
	
	/**
	 * 値を追加する.
	 *
	 * @param element 追加される要素
	 * @return メソッドチェーン用
	 */
	public Library<E> add(E element) {
		library.add(element);
		
		return this;
	}
	
	/**
	 * ライブラリを結合する.
	 *
	 * @param lib {@code java.util.Collection<E>.addAll(Collection<E>)}
	 * @return メソッドチェーン用
	 */
	public Library<E> merge(Library<? extends E> lib) {
		lib.forEach(e -> library.add(e));
		
		return this;
	}
	
	/** @param action {@link java.lang.Iterable}を参照せよ */
	public void forEach(Consumer<? super E> action) {
		library.forEach(action);
	}
}