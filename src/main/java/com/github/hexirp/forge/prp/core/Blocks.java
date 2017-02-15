package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.LoadableLibrary;
import com.github.hexirp.forge.loadable.block.LoadableBlock;
import com.github.hexirp.forge.prp.core.blocks.SilverOre;

/**
 * PRP-Coreで追加されるブロック群を定義する.
 *
 * @author Hexirp
 */
public class Blocks extends LoadableLibrary {
	/** コントストラクタ. */
	public Blocks() {
		library.add(new LoadableBlock(new SilverOre()));
	}
}