package hexirp.forge.loadable;

import hexirp.annotation.Command;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class ItemResourceLocation extends TwoFields<Item, String> {
	/**
	 * @param first 名前付きアイテム
	 * @param second スネークケースでの名前
	 */
	@Setting
	public ItemResourceLocation(final @Nullable Item first, final String second) {
		super(first, second);
	}
	
	/**
	 * アイテムのリソースの箇所を登録する.
	 *
	 * @param env 登録する環境
	 */
	@Command
	public void set(final Environment env) {
		if (env.side() == Side.CLIENT)
		    ModelLoader.setCustomModelResourceLocation(
		        first,
		        0,
		        env.location(second, "inventory"));
	}
}
