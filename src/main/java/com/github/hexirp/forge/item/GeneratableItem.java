package com.github.hexirp.forge.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * このクラスは、Itemを他のオブジェクトから生成することが出来るようにしたものを表現する.
 *
 * @author Hexirp
 */
public class GeneratableItem {
	/** 保持するアイテム */
	private final Item item;
	
	/**
	 * 変換するコントストラクタ.
	 *
	 * @param obj 変換できるかどうかわからないオブジェクト
	 * @throws ClassCastException Itemに変換できない場合
	 */
	public GeneratableItem(Object obj) throws ClassCastException {
		item = toItem(obj);
	}
	
	/**
	 * Getter.
	 *
	 * @return 保持しているアイテム
	 */
	public Item item() {
		return item;
	}
	
	/**
	 * Itemへ安全にキャストする. Blockの場合はItemに変換するためのメソッドが存在するのでそれを使用する.
	 *
	 * @param obj ItemかBlockでなければならない.
	 * @return Itemにキャストされた返り値
	 */
	private static final Item toItem(Object obj) {
		if (obj instanceof Item) return (Item) obj;
		
		if (obj instanceof Block) return Item.getItemFromBlock((Block) obj);
		else throw new ClassCastException();
	}
}
