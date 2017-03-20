package hexirp.forge.loadable.block;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * ロード可能なブロックを表現する.
 *
 * @author Hexirp
 */
public class LoadableBlock implements Loadable {
	/** 保持するブロック. */
	private final Block block;

	/** ブロックの名前. */
	private final String name;

	/**
	 * @param block 名前付きブロック
	 * @param name スネークケースでの名前
	 */
	@Setting
	public LoadableBlock(final Block block, final String name) {
		this.block = block;
		this.name = name;
	}

	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(block, name);

		new BlockResourceLocation(block, name).set(env);

		return new Index<MinecraftItem>().put(
		    name,
		    new MinecraftItem(block));
	}
}
