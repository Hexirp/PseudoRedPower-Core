package com.github.hexirp.forge.recipe.builder;

/**
 * 最終フェーズを表す.
 *
 * @author Hexirp
 * @param <T> 生成物の型
 */
public interface FinalPhase<T> {
	/**
	 * 生成物の決定.
	 *
	 * @return 生成物
	 */
	public T to();
}
