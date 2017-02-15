package com.github.hexirp.forge;

import com.github.hexirp.forge.loadable.item.Environment;

/**
 * 要素一つ一つを読み込ませることが出来る{@link Library}を表現する.
 *
 * アイテムを追加するクラスを抽象化することにより作成された。
 *
 * @author Hexirp
 */
public abstract class LoadableLibrary implements Loadable {
	/** 辞書. */
	protected final Library<Loadable> library = new Library<>();
	
	@Override
	public Index<MinecraftItem> load(Environment env) {
		Index<MinecraftItem> ret = new Index<>();
		
		library.forEach(item -> ret.merge(item.load(env)));
		
		return ret;
	}
}