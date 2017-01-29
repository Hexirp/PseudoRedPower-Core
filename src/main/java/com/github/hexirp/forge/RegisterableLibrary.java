package com.github.hexirp.forge;

/**
 * 要素一つ一つを登録することが出来る{@link Library}を表現する.
 *
 * レシピを追加するクラスを抽象化することにより作成された。
 *
 * @author Hexirp
 */
public abstract class RegisterableLibrary implements Registerable {
	/** 辞書. */
	protected final Library<Registerable> library = new Library<>();
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
}
