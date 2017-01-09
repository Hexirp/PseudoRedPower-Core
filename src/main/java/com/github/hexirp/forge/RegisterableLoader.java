package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * このクラスはLoadableを自分自身を登録できるようにしたものを表現する.
 *
 * @author Hexirp
 */
public class RegisterableLoader implements Registerable {
	/** 自分自身が登録される環境の情報. */
	private final Environment env;
	
	/** 保持するアイテム. */
	private final Loadable loader;
	
	/**
	 * Setter.
	 *
	 * @param env 自分自身が登録される環境の情報
	 * @param loader 保持するアイテム
	 */
	public RegisterableLoader(Environment env, Loadable loader) {
		this.env = env;
		this.loader = loader;
	}
	
	@Override
	public void register() {
		loader.load(env);
	}
}
