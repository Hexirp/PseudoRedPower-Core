package com.github.hexirp.forge.item;

import com.github.hexirp.forge.Loadable;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * アイテムのリソースを表現する.
 *
 * @author Hexirp
 */
public class ItemResource implements Loadable {
	/** アイテムの名前. */
	private final String name;
	
	/** アイテム. */
	private final Item item;
	
	/**
	 * コントストラクタ.
	 *
	 * @param name スネークケース
	 * @param item アイテム
	 */
	public ItemResource(String name, Item item) {
		this.name = name;
		this.item = item;
	}
	
	@Override
	public void load(Environment env) {
		ModelLoader.setCustomModelResourceLocation(
		    item,
		    0,
		    env.location(name, "inventory"));
	}
}
