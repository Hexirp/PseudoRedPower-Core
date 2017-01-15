package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * 自分自身を読み込ませられる事を表現する.
 *
 * @author Hexirp
 */
public interface Loadable {
	/**
	 * 自分自身を読み込ませる.
	 *
	 * @param env 読み込ませる環境
	 * @return 辞書
	 */
	public ItemIndex load(Environment env);
}