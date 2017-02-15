package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * 要素一つ一つを読み込ませることが出来る{@link Library}を表現する.
 *
 * アイテムを追加するクラスを抽象化することにより作成された。
 *
 * @author Hexirp
 */
public abstract class LoadableLibrary extends Library<Loadable> implements Loadable {
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		final Index<MinecraftItem> ret = new Index<>();
		
		forEach(item -> ret.merge(item.load(env)));
		
		return ret;
	}
}