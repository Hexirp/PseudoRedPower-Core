package hexirp.forge.recipe;

import java.util.List;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.collection.LinkedListUser;

/**
 * レシピの並べ方を文字で抽象的に表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeAbstractOrder extends LinkedListUser<String> {
	/**
	 * @return 文字で表現されたレシピの並べ方
	 */
	@Getting
	public List<String> order() {
		return value;
	}
	
	/**
	 * レシピの下側に行を追加する.
	 *
	 * @param string アルファベットの大文字と空白のみで構成される文字列
	 * @return this
	 */
	@Chaining
	public ShapedRecipeAbstractOrder add(final String string) {
		value.add(string);
		return this;
	}
}
