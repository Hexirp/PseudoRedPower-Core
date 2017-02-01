package com.github.hexirp;

/**
 * ジェネリックスでしか表現できない型の情報を保存するコンテナを表現する.
 *
 * @author Hexirp
 * @param <Type> 保存する型
 */
public class Mixin<Type> {
	/** 保存する値. */
	private final Type t;
	
	/**
	 * Setter.
	 *
	 * @param t {@link #t}
	 */
	public Mixin(final Type t) {
		this.t = t;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #t}
	 */
	public Type get() {
		return t;
	}
}