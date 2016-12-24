package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.smelting.Smelting;

import net.minecraft.init.Items;

/**
 * このクラスは、PRP-Coreで追加される製錬レシピを定義する.
 *
 * @author Hexirp
 */
public class Smeltings {
	/**
	 * コントストラクタ. 設定を受け取れるようにする予定.
	 */
	public Smeltings() {}
	
	/**
	 * 製錬レシピを登録する.
	 */
	public void add() {
		new Smelting(
		    Items.carrot,
		    Items.coal,
		    0.1f).registry();
	}
}
