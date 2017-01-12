package com.github.hexirp.forge;

/**
 * MOD内で追加されるレシピを定義するクラスの抽象化.
 *
 * @author Hexirp
 */
public abstract class RegisterableLibrary implements Registerable {
	/** 保持する辞書. */
	protected final Library<Registerable> library = new Library<>();
	
	/** 自分自身のライブラリに追加する. */
	protected abstract void add();
	
	/** コントストラクタ. 設定を受け取れるようにする予定. */
	public RegisterableLibrary() {
		add();
	}
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
}