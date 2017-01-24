package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.Index;

import net.minecraft.item.Item;

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
		Index<Item> items = new Items().load(env);
		
		new Recipes(items).register();
	}
}