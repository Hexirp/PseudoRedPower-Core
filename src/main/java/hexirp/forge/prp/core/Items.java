package hexirp.forge.prp.core;

import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.item.LoadableItem;
import hexirp.forge.loadable.item.NamedItem;
import hexirp.forge.prp.core.items.SilverIngot;

/**
 * PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items extends LoadableLibrary {
	/** コントストラクタ. */
	public Items() {
		add(new LoadableItem(new NamedItem<>(new SilverIngot())));
	}
}