package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.ItemIndex;
import com.github.hexirp.forge.item.Environment;

/**
 * PRP-Coreにより追加されるメカニズム群、つまりアイテムやレシピなどを表現する.
 *
 * @author Hexirp
 */
public class Mechanism {
	/**
	 * PRP-Coreのメカニズム群を追加する.
	 *
	 * @param env 追加する環境
	 */
	public void add(Environment env) {
		ItemIndex items = new Items().load(env);
		
		new Recipes(items).register();
	}
}