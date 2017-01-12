package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * アイテムを追加するクラスの抽象化.
 *
 * @author Hexirp
 */
public abstract class LoadableLibrary implements Loadable {
	/** MODに追加されるアイテムの辞書. */
	protected final Library<Loadable> library = new Library<>();
	
	/** 辞書にアイテムを追加する. */
	protected abstract void add();
	
	/** コントストラクタ. 設定を受け取れるようにする予定. */
	public LoadableLibrary() {
		add();
	}
	
	@Override
	public void load(Environment env) {
		library.forEach(item -> item.load(env));
	}
}