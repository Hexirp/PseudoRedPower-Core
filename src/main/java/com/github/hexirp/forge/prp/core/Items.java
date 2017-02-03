package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.LoadableLibrary;
import com.github.hexirp.forge.prp.core.items.SampleItem;

/**
 * PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items extends LoadableLibrary {
	/** コントストラクタ. */
	public Items() {
		library.add(new SampleItem().toLoadable());
	}
}