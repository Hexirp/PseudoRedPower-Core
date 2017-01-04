/**
 *
 */
package com.github.hexirp.forge.item;

import com.github.hexirp.forge.Registerable;

/**
 * このクラスはItemを自分自身を登録できるようにしたものを表現する.
 *
 * @author Hexirp
 */
public class RegisterableItem implements Registerable {
	/** 自分自身が登録される環境の情報 */
	private final Environment env;
	
	/** 保持するアイテム */
	private final Item item;
	
	/**
	 * コントストラクタ.
	 *
	 * @param env 自分自身が登録される環境の情報
	 * @param item 保持するアイテム
	 */
	public RegisterableItem(Environment env, Item item) {
		this.env = env;
		this.item = item;
	}
	
	@Override
	public void register() {
		item.load(env);
	}
}
