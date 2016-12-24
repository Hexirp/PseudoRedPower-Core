package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.item.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items {
	/**
	 * Modの情報.
	 */
	private final ModMetadata metadata;
	
	/**
	 * 情報を取り出すためにEventを保持する.
	 */
	private final FMLPreInitializationEvent event;
	
	/**
	 * Eventを内部に保持するためのコントストラクタ.
	 *
	 * @param data MODのデータ
	 * @param e 初期化前処理イベント
	 */
	public Items(ModMetadata data, FMLPreInitializationEvent e) {
		metadata = data;
		event = e;
	}
	
	/**
	 * アイテムを追加する.
	 */
	public void add() {
		new Item(metadata, event, "sample_item", CreativeTabs.tabMaterials).registry();
	}
}
