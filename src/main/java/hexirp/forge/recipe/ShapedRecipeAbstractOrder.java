package hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;

/**
 * レシピの並べ方を文字で抽象的に表現する.
 *
 * <h2>使用例</h2>
 *
 * <pre>
 * new ShapedRecipeAbstractOrder()
 *     .add("AAA")
 *     .add("AAA")
 *     .add("AAA")
 * </pre>
 *
 * @author Hexirp
 */
public class ShapedRecipeAbstractOrder {
	/** 文字で表現されたレシピの並べ方. */
	private final List<String> order = new LinkedList<String>();

	/**
	 * レシピの並べ方を取得する.
	 *
	 * @return {@link #order}
	 */
	@Getting
	public List<String> order() {
		return order;
	}

	/**
	 * レシピの下側に行を追加する.
	 *
	 * @param string アルファベットの大文字と空白のみで構成される文字列
	 * @return メソッドチェーン用
	 */
	@Chaining
	public ShapedRecipeAbstractOrder add(final String string) {
		order.add(string);

		return this;
	}
}
