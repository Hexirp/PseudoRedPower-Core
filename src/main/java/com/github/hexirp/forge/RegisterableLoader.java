package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * このクラスは{@link Loadable}を{@link Registerable}に変換した物を表現する.
 *
 * @author Hexirp
 */
public class RegisterableLoader implements Registerable {
	/** 登録される環境. */
	private final Environment env;
	
	/** 登録する{@link Loadable}. */
	private final Loadable loader;
	
	/**
	 * 設定するコントストラクタ.
	 *
	 * @param env {@link #env}
	 * @param loader {@link #loader}
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
