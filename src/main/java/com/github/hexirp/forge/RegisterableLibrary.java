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
	
	/** 辞書に要素を追加する. */
	protected abstract void add();
	
	/**
	 * コントストラクタ.
	 *
	 * @future 設定を受け取れるようにする
	 */
	public RegisterableLibrary() {
		add();
	}
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
}