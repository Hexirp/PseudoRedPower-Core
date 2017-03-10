package hexirp.forge.loadable.item;

import hexirp.annotation.Method.Command;
import hexirp.annotation.Method.Setting;
import hexirp.forge.loadable.Environment;
import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムのリソースの箇所を表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きアイテム
 */
public class ItemResourceLocation<Type extends Item & Named> extends NamedType<Type> {
	/**
	 * @param item 名前付きアイテム
	 */
	@Setting
	public ItemResourceLocation(final Type item) {
		super(item);
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
		        this.value(),
		        0,
		        env.location(this.name(), "inventory"));
	}
}
