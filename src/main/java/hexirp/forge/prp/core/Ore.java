package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.forge.LoadableLibrary;
import hexirp.forge.loadable.LoadableBlock;
import hexirp.forge.loadable.LoadableItem;
import hexirp.forge.prp.core.ore.SilverIngot;
import hexirp.forge.prp.core.ore.SilverOre;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Ore extends LoadableLibrary {
	/** コントストラクタ. */
	@Setting
	public Ore() {
		add(new LoadableItem(new SilverIngot(), new SilverIngot().name()));
		add(new LoadableBlock(new SilverOre(), new SilverOre().name()));
	}
}
