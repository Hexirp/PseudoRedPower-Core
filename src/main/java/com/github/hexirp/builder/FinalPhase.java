package com.github.hexirp.builder;

/**
 * Builderにおいて最終段階を表現する.
 *
 * @author Hexirp
 * @param <Product> 生成物の型
 */
public interface FinalPhase<Product> {
	/**
	 * 生成する.
	 *
	 * @return 生成物
	 */
	public Product to();
}
