package hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Getting;
import hexirp.annotation.Nullable;

/**
 * レシピの並べ方を文字で抽象的に表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeAbstractOrder {
	/** 文字で表現されたレシピの並べ方. */
	private final List<String> order = new LinkedList<String>();
	
	/**
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
	 * @return this
	 */
	@Chaining
	public ShapedRecipeAbstractOrder add(final String string) {
		order.add(string);
		
		return this;
	}
	
	@Getting
	@Override
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		return (obj instanceof ShapedRecipeAbstractOrder) ? order.equals(((ShapedRecipeAbstractOrder) obj).order) : false;
	}
	
	@Getting
	@Override
	public int hashCode() {
		return order.hashCode();
	}
}
