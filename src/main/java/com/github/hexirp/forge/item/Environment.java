package com.github.hexirp.forge.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムを登録する際の環境を表現する.
 *
 * @author Hexirp
 */
public class Environment {
	/** MODの環境. */
	private final ModMetadata metadata;
	
	/** 現在イベントの環境. */
	private final FMLPreInitializationEvent event;
	
	/**
	 * Setter.
	 *
	 * @param metadata MOD
	 * @param event Forge
	 */
	public Environment(ModMetadata metadata, FMLPreInitializationEvent event) {
		this.metadata = metadata;
		this.event = event;
	}
	
	/**
	 * @return イベントが行われている場所.
	 */
	public Side side() {
		return event.getSide();
	}
	
	/**
	 * @return モデルのリソース保存場所.
	 * @param name リソースの名前
	 * @param loc 意味がまだ分からない
	 */
	public ModelResourceLocation location(String name, String loc) {
		return new ModelResourceLocation(metadata.modId + ":" + name, loc);
	}
}