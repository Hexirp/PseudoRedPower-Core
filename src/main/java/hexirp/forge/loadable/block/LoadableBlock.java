package hexirp.forge.loadable.block;

import hexirp.annotation.NonNull;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * ロード可能なブロックを表現する.
 *
 * @author Hexirp
 */
public class LoadableBlock implements Loadable {
	/** ブロック. */
	private final NamedBlock<@NonNull ?> block;
	
	/**
	 * Setter.
	 *
	 * @param block 名前付きブロック
	 */
	public LoadableBlock(final NamedBlock<@NonNull ?> block) {
		this.block = block;
	}
	
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(block.get(), block.get().name());
		
		new BlockResourceLocation(block).set(env);
		
		return new Index<MinecraftItem>().put(
		    block.get().name(),
		    new MinecraftItem(block.get()));
	}
}