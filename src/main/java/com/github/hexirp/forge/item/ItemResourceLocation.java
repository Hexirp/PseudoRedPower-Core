package com.github.hexirp.forge.item;

import com.github.hexirp.annotation.NonNull;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class ItemResourceLocation {
	/** リソースが登録される環境. */
	private final Environment env;
	
	/**
	 * Setter.
	 *
	 * @param env {@link #env}
	 */
	public ItemResourceLocation(final Environment env) {
		this.env = env;
	}
	
	/**
	 * アイテムのリソースの箇所を登録する.
	 *
	 * @param i 名前付きアイテム
	 */
	public void register(final NamedItem<@NonNull ?> i) {
		if (env.side() == Side.CLIENT)
		    ModelLoader.setCustomModelResourceLocation(
		        i.get(),
		        0,
		        env.location(i.name(), "inventory"));
	}
}