package hexirp.forge.loadable;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * {@link Loadable}である{@link Item}を表現する.
 *
 * @author Hexirp
 */
public class LoadableItem extends TwoFields<Item, String> implements Loadable {
	/**
	 * @param first 名前付きアイテム
	 * @param second スネークケースでの名前
	 */
	@Setting
	public LoadableItem(final Item first, final String second) {
		super(first, second);
	}
	
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerItem(first, second); // アイテムを登録する
		
		new ItemResourceLocation(first, second).set(env); // アイテムのリソースを登録する
		
		return new Index<MinecraftItem>().put(
		    second,
		    new MinecraftItem(first));
	}
}
