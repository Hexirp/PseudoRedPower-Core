package com.github.hexirp.forge.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムが登録される環境を表現する.
 *
 * @author Hexirp
 */
public class Environment {
	/** アイテムが登録されるMODの情報. */
	private final ModMetadata metadata;
	
	/** アイテムが登録されるイベントの情報. */
	private final FMLPreInitializationEvent event;
	
	/**
	 * Setter.
	 *
	 * @param metadata {@link #metadata}
	 * @param event {@link #event}
	 */
	public Environment(final ModMetadata metadata, final FMLPreInitializationEvent event) {
		this.metadata = metadata;
		this.event = event;
	}
	
	/**
	 * イベントがどこで発生しているかを取得する.
	 *
	 * @return イベントが行われている場所
	 */
	@SuppressWarnings("null")
	public Side side() {
		return event.getSide();
	}
	
	/**
	 * アイテムのモデルを登録するためにリソース箇所の情報を生成する.
	 *
	 * @param name アイテムの名前
	 * @param loc TODO: まだ意味が分からない。アイテムを登録する際には"inventory"とする。
	 * @return モデルリソース箇所の情報
	 */
	public ModelResourceLocation location(final String name, final String loc) {
		return new ModelResourceLocation(metadata.modId + ":" + name, loc);
	}
}