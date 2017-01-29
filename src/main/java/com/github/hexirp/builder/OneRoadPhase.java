package com.github.hexirp.builder;

/**
 * 次の段階が一つしかない段階を表現する.
 *
 * @author Hexirp
 * @param <Product> 生成物の型
 */
public interface OneRoadPhase<Product extends StackedPhase<? extends OneRoadPhase<Product>>> {
	/**
	 * 次の段階に進む.
	 *
	 * @return 生成物
	 */
	public Product to();
}
