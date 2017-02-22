package hexirp.forge.prp.core;

import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.block.LoadableBlock;
import hexirp.forge.loadable.item.LoadableItem;
import hexirp.forge.prp.core.blocks.SilverOre;
import hexirp.forge.prp.core.items.SilverIngot;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Ores extends LoadableLibrary {
	/** コントストラクタ. */
	public Ores() {
		add(new LoadableItem<>(new SilverIngot()));
		add(new LoadableBlock<>(new SilverOre()));
	}
}