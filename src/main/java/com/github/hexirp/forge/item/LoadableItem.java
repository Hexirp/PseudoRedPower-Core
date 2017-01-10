package com.github.hexirp.forge.item;

import com.github.hexirp.Named;
import com.github.hexirp.forge.Loadable;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * このクラスは、Itemを表現する. 実際にはMinecraftのItemクラスをラップしている.
 *
 * @author Hexirp
 */
public class LoadableItem implements Loadable, Named {
	/** アイテムの名前を保持する. */
	private final String name;
	
	/** アイテムを保持する. */
	private final Item item;
	
	/**
	 * コントストラクタ. 名前はスネークケースで記述する事.
	 *
	 * @param <NamedItem> 名前付きアイテムを表現する
	 * @param item NamedItem
	 */
	public <NamedItem extends Item & Named> LoadableItem(NamedItem item) {
		this.name = item.name();
		this.item = item;
	}
	
	/**
	 * 別途リソースを追加する事.
	 */
	@Override
	public void load(Environment env) {
		GameRegistry.registerItem(item, name);
		
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(item, 0, env.location(name, "inventory"));
	}
	
	@Override
	public String name() {
		return name;
	}
}
