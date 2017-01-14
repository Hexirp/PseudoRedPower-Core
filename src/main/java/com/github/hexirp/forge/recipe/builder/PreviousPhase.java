package com.github.hexirp.forge.recipe.builder;

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
	 * レシピの結果を取得する.
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
	public PreviousPhase(Previous previous) {
		this.previous = previous;
	}
}