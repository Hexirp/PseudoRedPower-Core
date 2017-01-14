package com.github.hexirp.forge;

import com.github.hexirp.forge.item.Environment;

/**
 * このクラスは{@link Loadable}を{@link Registerable}に変換した物を表現する.
 *
 * @author Hexirp
 */
public class RegisterableLoader implements Registerable {
	/** 環境. */
	private final Environment env;
	
	/** 読み込ませる{@link Loadable}. */
	private final Loadable loader;
	
	/**
	 * Setter.
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
