package com.github.hexirp.forge;

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
	
}