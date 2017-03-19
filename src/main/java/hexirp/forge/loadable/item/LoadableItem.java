package hexirp.forge.loadable.item;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
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
	/** 保持するアイテム. */
	private final Item item;
	
	/** 保持するアイテムの名前. */
	private final String name;
	
	/**
	 * @param item アイテム
	 * @param name スネークケースでの名前
	 */
	@Setting
	public LoadableItem(final Item item, final String name) {
		this.item = item;
		this.name = name;
	}
	
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerItem(item);
		
		new ItemResourceLocation(item, name).set(env);
		
		return new Index<MinecraftItem>().put(
		    name,
		    new MinecraftItem(item));
	}
}
