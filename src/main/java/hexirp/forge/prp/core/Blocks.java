package hexirp.forge.prp.core;

import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.block.LoadableBlock;
import hexirp.forge.prp.core.blocks.SilverOre;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Blocks extends LoadableLibrary {
	/** コントストラクタ. */
	public Blocks() {
		add(new LoadableBlock(new SilverOre()));
	}
}