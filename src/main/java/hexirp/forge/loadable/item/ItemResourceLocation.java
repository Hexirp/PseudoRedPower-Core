package hexirp.forge.loadable.item;

import hexirp.annotation.NonNull;
import hexirp.forge.loadable.Environment;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class ItemResourceLocation {
	/** リソースが表現するアイテム. */
	private final NamedItem<@NonNull ?> item;

	/**
	 * Setter.
	 *
	 * @param i {@link #item}
	 */
	public ItemResourceLocation(final NamedItem<@NonNull ?> i) {
		this.item = i;
	}

	/**
	 * アイテムのリソースの箇所を登録する.
	 *
	 * @param env 登録する環境
	 */
	public void set(final Environment env) {
		if (env.side() == Side.CLIENT)
		    ModelLoader.setCustomModelResourceLocation(
		        item.get(),
		        0,
		        env.location(item.get().name(), "inventory"));
	}
}