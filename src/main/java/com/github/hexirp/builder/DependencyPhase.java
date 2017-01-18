package com.github.hexirp.builder;

/**
 * 前段階に依存する段階を表現する.
 *
 * @author Hexirp
 * @param <Previous> 前段階の型
 */
public class DependencyPhase<Previous> {
	/** 前段階. */
	private final Previous previous;
	
	/**
	 * 前段階を取得する.
	 *
	 * @return {@link #previous}
	 */
	public Previous previous() {
		return previous;
	}
	
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	public DependencyPhase(Previous previous) {
		this.previous = previous;
	}
}