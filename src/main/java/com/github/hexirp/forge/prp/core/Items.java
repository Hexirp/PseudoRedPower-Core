package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.LoadableLibrary;
import com.github.hexirp.forge.item.LoadableItem;
import com.github.hexirp.forge.prp.core.items.SampleItem;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items extends LoadableLibrary {
	@Override
	protected void add() {
		library.add(
		    new LoadableItem(
		        new SampleItem()));
	}
}
