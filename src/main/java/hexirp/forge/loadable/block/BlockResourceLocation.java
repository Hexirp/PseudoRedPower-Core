package hexirp.forge.loadable.block;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.Environment;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * ブロックのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class BlockResourceLocation {
	/** 保持するブロック. */
	private final Block block;
	
	/** ブロックの名前. */
	private final String name;
	
	/**
	 * @param block 名前付きブロック
	 * @param name スネークケースでの名前
	 */
	@Setting
	public BlockResourceLocation(final Block block, final String name) {
		this.block = block;
		this.name = name;
	}
	
	/**
	 * ブロックのリソースの箇所を登録する.
	 *
	 * @param env 登録する環境
	 */
	@Command
	public void set(final Environment env) {
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(block),
		    0,
		    env.location(name, "inventory"));
	}
}
