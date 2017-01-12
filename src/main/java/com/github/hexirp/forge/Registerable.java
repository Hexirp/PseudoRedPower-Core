package com.github.hexirp.forge;

import java.util.List;

/**
 * 自分自身をゲームに登録することが出来る事を示す.
 *
 * @author Hexirp
 */
public interface Registerable {
	/** 自分自身をゲームに登録する. */
	public void register();
	
	/**
	 * 自分自身をリストに追加する.
	 *
	 * @param library リスト
	 */
	public default void add(List<Registerable> library) {
		library.add(this);
	}
}