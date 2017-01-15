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
	
	/** アイテムの索引. */
	protected ItemIndex index;
	
	/**
	 * 辞書に要素を追加する.
	 *
	 */
	protected abstract void add();
	
	/**
	 * 辞書に要素を追加する.
	 *
	 * @return メソッドチェーン用
	 */
	public RegisterableLibrary setRecipe() {
		add();
		return this;
	}
	
	/**
	 * Setter.
	 *
	 * @param items {@link #index}
	 * @return メソッドチェーン用
	 */
	public RegisterableLibrary setIndex(ItemIndex items) {
		index = items;
		return this;
	}
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
}