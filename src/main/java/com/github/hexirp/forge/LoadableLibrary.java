package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

import net.minecraft.item.Item;

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
	public Index<Item> load(Environment env) {
		Index<Item> ret = new Index<Item>();
		
		library.forEach(item -> ret.merge(item.load(env)));
		
		return ret;
	}
}