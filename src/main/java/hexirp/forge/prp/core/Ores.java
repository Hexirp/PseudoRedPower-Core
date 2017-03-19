package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.block.LoadableBlock;
import hexirp.forge.loadable.item.LoadableItem;
import hexirp.forge.prp.core.ores.SilverIngot;
import hexirp.forge.prp.core.ores.SilverOre;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Ores extends LoadableLibrary {
	/** コントストラクタ. */
	@Setting
	public Ores() {
		add(new LoadableItem<>(new SilverIngot()));
		add(new LoadableBlock<>(new SilverOre()));
	}
}
