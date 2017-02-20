package hexirp.forge.loadable.item;

import hexirp.Named;
import hexirp.annotation.NonNull;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		GameRegistry.registerItem(i.get(), i.get().name());
		
		new ItemResourceLocation(i).set(env);
		
		return new Index<MinecraftItem>().put(
		    i.get().name(),
		    new MinecraftItem(i.get()));
	}
}