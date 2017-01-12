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
	 * @param element 追加される要素
	 * @return メソッドチェーン用
	 */
	public <E2 extends E> Library<E> add(E2 element) {
		library.add(element);
		
		return this;
	}
	
	/** @param action {@link java.lang.Iterable}を参照せよ */
	public void forEach(Consumer<? super E> action) {
		library.forEach(action);
	}
}