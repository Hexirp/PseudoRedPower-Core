package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

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
	
	/** 辞書に要素を追加する. */
	protected abstract void add();
	
	/**
	 * コントストラクタ.
	 *
	 * @future 設定を受け取れるようにする
	 */
	public LoadableLibrary() {
		add();
	}
	
	@Override
	public void load(Environment env) {
		library.forEach(item -> item.load(env));
	}
}