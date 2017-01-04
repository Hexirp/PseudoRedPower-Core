package com.github.hexirp.forge.item;

import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * 環境.
 *
 * @author Hexirp
 */
public class Environment {
	/** MODの環境 */
	private final ModMetadata metadata;
	
	/** 現在イベントの環境 */
	private final FMLPreInitializationEvent event;
	
	/**
	 * コントストラクタ
	 *
	 * @param metadata MOD
	 * @param event Forge
	 */
	public Environment(ModMetadata metadata, FMLPreInitializationEvent event) {
		this.metadata = metadata;
		this.event = event;
	}
	
	/**
	 * @return イベントが行われている場所
	 */
	public Side side() {
		return event.getSide();
	}
	
	/**
	 * @return どのMODで行われているか
	 */
	public String mod_id() {
		return metadata.modId;
	}
}