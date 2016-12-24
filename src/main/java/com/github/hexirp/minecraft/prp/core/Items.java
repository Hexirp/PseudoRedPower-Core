package com.github.hexirp.minecraft.prp.core;

import com.github.hexirp.minecraft.item.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items {
	/**
	 * 情報を取り出すためにEventを保持する.
	 */
	private FMLPreInitializationEvent event;
	
	/**
	 * Eventを内部に保持するためのコントストラクタ.
	 *
	 * @param e 初期化前処理イベント
	 */
	public Items(FMLPreInitializationEvent e) {
		event = e;
	}
	
	/**
	 * アイテムを追加する.
	 */
	public void add() {
		new Item(event, "sample_item", CreativeTabs.tabMaterials).registry();
	}
}
