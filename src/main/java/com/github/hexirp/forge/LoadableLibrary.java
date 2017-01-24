package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.Index;
import com.github.hexirp.forge.item.ItemIndex;

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
	public ItemIndex load(Environment env) {
		Index ret = new ItemIndex();
		
		library.forEach(item -> ret.merge(item.load(env)));
		
		return (ItemIndex) ret;
	}
}