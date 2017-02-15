package com.github.hexirp.forge.loadable.item;

import com.github.hexirp.Named;
import com.github.hexirp.annotation.NonNull;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.Loadable;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.loadable.Environment;

import net.minecraft.item.Item;

/**
 * {@link Loadable}である{@link Item}を表現する.
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
		i.register();
		
		new ItemResourceLocation(i).set(env);
		
		return new Index<MinecraftItem>().put(
		    i.get().name(),
		    new MinecraftItem(i.get()));
	}
}