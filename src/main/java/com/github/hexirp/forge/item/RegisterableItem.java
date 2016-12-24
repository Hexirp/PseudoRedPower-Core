/**
 *
 */
package com.github.hexirp.forge.item;

import com.github.hexirp.forge.Registerable;

import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスはItemを自分自身を登録できるようにしたものを表現する.
 *
 * @author Hexirp
 */
public class RegisterableItem implements Registerable {
	/** 自分自身を登録するMODの情報 */
	private final ModMetadata metadata;
	
	/** 自分自身が登録されるイベントの情報 */
	private final FMLPreInitializationEvent event;
	
	/** 保持するアイテム */
	private final Item item;
	
	/**
	 * コントストラクタ.
	 *
	 * @param metadata 自分自身を登録するMODの情報
	 * @param event 自分自身が登録されるイベントの情報
	 * @param item 保持するアイテム
	 */
	public RegisterableItem(ModMetadata metadata, FMLPreInitializationEvent event, Item item) {
		this.metadata = metadata;
		this.event = event;
		this.item = item;
	}
	
	@Override
	public void registry() {
		item.registry(metadata, event);
	}
}
