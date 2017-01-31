package com.github.hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import com.github.hexirp.ConvertToArray;

/**
 * {@link ShapedRecipeAbstractOrder}と{@link ShapedRecipeMaterialMap}を合わせてレシピの並べ方を表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeOrder {
	/** 文字で抽象的に表現された並べ方. */
	private final ShapedRecipeAbstractOrder order;

	/** 文字とアイテムとの対応関係. */
	private final ShapedRecipeMaterialMap input;

	/**
	 * Setter.
	 *
	 * @param order {@link #order}
	 * @param input {@link #input}
	 */
	public ShapedRecipeOrder(final ShapedRecipeAbstractOrder order, final ShapedRecipeMaterialMap input) {
		this.order = order;
		this.input = input;
	}

	/**
	 * 配列へ変換する.
	 *
	 * @return 配列での表現
	 */
	public Object[] calc() {
		final List<Object> ret = new LinkedList<>();
		ret.addAll(order.order());
		ret.addAll(input.toList());

		return new ConvertToArray<>(ret).to();
	}
}
