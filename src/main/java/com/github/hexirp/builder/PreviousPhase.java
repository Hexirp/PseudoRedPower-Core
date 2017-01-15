package com.github.hexirp.builder;

/**
 * 前段階を持つ段階を表現する.
 *
 * @author Hexirp
 * @param <Previous> 前段階の型
 */
public class PreviousPhase<Previous> {
	/** 前段階. */
	protected final Previous previous;
	
	/**
	 * 前段階を取得する.
	 *
	 * @return {@link #previous}
	 */
	protected Previous previous() {
		return previous;
	}
	
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	public PreviousPhase(Previous previous) {
		this.previous = previous;
	}
}