package hexirp.forge.prp.core;

import hexirp.annotation.Setting;
import hexirp.forge.LoadableLibrary;
import hexirp.forge.prp.core.ore.SilverBlock;
import hexirp.forge.prp.core.ore.SilverIngot;
import hexirp.forge.prp.core.ore.SilverOre;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public final class Ore extends LoadableLibrary {
	/** コントストラクタ. */
	@Setting
	public Ore() {
		add(new SilverIngot().loader());
		add(new SilverOre().loader());
		add(new SilverBlock().loader());
	}
}
