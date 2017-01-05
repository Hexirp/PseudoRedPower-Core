package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.Registerable;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items implements Registerable {
	/** 自分自身が登録される環境の情報 */
	private final Environment env;
	
	/**
	 * Eventを内部に保持するためのコントストラクタ.
	 *
	 * @param data MODのデータ
	 * @param e 初期化前処理イベント
	 */
	public Items(ModMetadata data, FMLPreInitializationEvent e) {
		env = new Environment(data, e);
	}
	
	/**
	 * アイテムを追加する.
	 */
	@Override
	public void register() {
		new ModItem("sample_item",
		    new Item()
		        .setCreativeTab(CreativeTabs.tabMaterials)).load(env);
	}
}
