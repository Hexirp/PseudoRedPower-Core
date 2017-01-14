package com.github.hexirp.forge.recipe.builder;

/**
 * Builderにおいて最終段階を表現する.
 *
 * @author Hexirp
 * @param <T> 生成物の型
 */
public interface FinalPhase<T> {
	/**
	 * 生成する.
	 *
	 * @return 生成物
	 */
	public T to();
}
