package hexirp.forge.prp.core;

import hexirp.annotation.Method.Setting;
import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.item.LoadableItem;
import hexirp.forge.prp.core.ores.SilverIngot;

/**
 * PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items extends LoadableLibrary {
	/** コントストラクタ. */
	@Setting
	public Items() {
		add(new LoadableItem<>(new SilverIngot()));
	}
}
