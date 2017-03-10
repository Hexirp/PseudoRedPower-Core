package hexirp.forge.loadable.block;

import hexirp.annotation.Method.Command;
import hexirp.annotation.Method.Setting;
import hexirp.forge.loadable.Environment;
import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * ブロックのリソースの箇所を表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きブロック
 */
public class BlockResourceLocation<Type extends Block & Named> extends NamedType<Type> {
	/**
	 * @param block 名前付きブロック
	 */
	@Setting
	public BlockResourceLocation(final Type block) {
		super(block);
	}
	
	/**
	 * ブロックのリソースの箇所を登録する.
	 *
	 * @param env 登録する環境
	 */
	@Command
	public void set(final Environment env) {
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(this.value()),
		    0,
		    env.location(this.name(), "inventory"));
	}
}
