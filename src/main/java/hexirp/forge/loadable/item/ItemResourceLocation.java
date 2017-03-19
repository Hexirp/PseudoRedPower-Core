package hexirp.forge.loadable.item;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.Environment;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class ItemResourceLocation {
	/** 保持するアイテム. */
	private final Item item;
	
	/** 保持する名前. */
	private final String name;
	
	/**
	 * @param item 名前付きアイテム
	 * @param name スネークケースでの名前
	 */
	@Setting
	public ItemResourceLocation(final Item item, final String name) {
		this.item = item;
		this.name = name;
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
		        item,
		        0,
		        env.location(name, "inventory"));
	}
}
