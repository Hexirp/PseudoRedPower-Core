package com.github.hexirp.forge.item;

import com.github.hexirp.Named;
import com.github.hexirp.NamedItem;
import com.github.hexirp.annotation.NonNull;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.Loadable;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * {@link Loadable}である{@link Item}を表現する.
 *
 * 実際は{@link Item}を包み、簡単に登録する事が出来るようにした物である。
 * このクラスを使用してアイテムを登録するには、また別にリソースを追加しなければならない。
 *
 * @author Hexirp
 */
public class LoadableItem implements Loadable {
	/** アイテム. */
	private final NamedItem<@NonNull ?> i;
	
	/**
	 * コントストラクタ.
	 *
	 * @param item スネークケースでの名前が付いたアイテム
	 * @param <T> 名前付きアイテム
	 */
	public <T extends Item & Named> LoadableItem(final T item) {
		i = new NamedItem<>(item);
	}
	
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerItem(i.get(), i.name());
		
		new ItemResourceLocation(env).register(i);
		
		return new Index<MinecraftItem>().put(i.name(), new MinecraftItem(i.get()));
	}
}