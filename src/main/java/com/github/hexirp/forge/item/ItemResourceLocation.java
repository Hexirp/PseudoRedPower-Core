package com.github.hexirp.forge.item;

import net.minecraft.item.Item;
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
	public ItemResourceLocation(Environment env) {
		this.env = env;
	}
	
	/**
	 * アイテムのリソースの箇所を登録する.
	 *
	 * @param item アイテム
	 * @param name アイテムの名前
	 */
	public void register(Item item, String name) {
		if (env.side() == Side.CLIENT)
		    ModelLoader.setCustomModelResourceLocation(
		        item,
		        0,
		        env.location(name, "inventory"));
	}
}