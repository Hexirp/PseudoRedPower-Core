package com.github.hexirp.forge.item;

import com.github.hexirp.Named;
import com.github.hexirp.forge.Loadable;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * {@link Loadable}である{@link Item}を表現する.
 *
 * 実際は{@link Item}を包み、簡単に登録する事が出来るようにした物である。
 * このクラスを使用してアイテムを登録するには、また別にリソースを追加しなければならない。
 *
 * @author Hexirp
 */
public class LoadableItem implements Loadable, Named {
	/** アイテムの名前. */
	private final String name;
	
	/** アイテム. */
	private final Item item;
	
	/**
	 * コントストラクタ. 名前はスネークケースで記述しなければならない。
	 *
	 * @param <NamedItem> 名前付きアイテムを表現する
	 * @param item NamedItem
	 */
	public <NamedItem extends Item & Named> LoadableItem(NamedItem item) {
		this.name = item.name();
		this.item = item;
	}
	
	@Override
	public void load(Environment env) {
		GameRegistry.registerItem(item, name);
		
		if (env.side() == Side.CLIENT)
		    ModelLoader.setCustomModelResourceLocation(
		        item,
		        0,
		        env.location(name, "inventory")); // TODO: この部分が大きすぎるため、分離する
	}
	
	@Override
	public String name() {
		return name;
	}
}
