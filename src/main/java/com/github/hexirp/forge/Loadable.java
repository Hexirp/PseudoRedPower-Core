package com.github.hexirp.forge;

import java.util.List;

import com.github.hexirp.forge.item.Environment;

/**
 * 自分自身を読み込むことが出来ることを表現する.
 *
 * @author Hexirp
 */
public interface Loadable {
	/**
	 * 自分自身を読み込む.
	 *
	 * @param env アイテムが登録される環境
	 */
	void load(Environment env);
	
	/**
	 * 自分自身をリストに追加する
	 *
	 * @param library リスト
	 */
	public default void add(List<Loadable> library) {
		library.add(this);
	}
}