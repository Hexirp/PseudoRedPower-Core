package com.github.hexirp.forge;

import java.util.LinkedList;
import java.util.List;

/**
 * MOD内で追加されるレシピやアイテムを定義するクラスの抽象化.
 *
 * @author Hexirp
 */
public abstract class Library implements Registerable {
	/**
	 * 保持する辞書.
	 */
	protected final List<Registerable> library = new LinkedList<>();
	
	/** 自分自身のライブラリに追加する */
	protected abstract void add();
	
	/** コントストラクタ. 設定を受け取れるようにする予定. */
	public Library() {
		add();
	}
	
	@Override
	public void register() {
		library.forEach(recipe -> recipe.register());
	}
	
}