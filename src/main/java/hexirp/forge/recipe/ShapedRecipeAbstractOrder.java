package hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.OneField;

/**
 * レシピの並べ方を文字で抽象的に表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipeAbstractOrder extends OneField<List<String>> {
	/** Setting. */
	@Setting
	public ShapedRecipeAbstractOrder() {
		super(new LinkedList<String>());
	}
	
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
