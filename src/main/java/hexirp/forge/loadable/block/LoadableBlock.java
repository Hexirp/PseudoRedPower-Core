package hexirp.forge.loadable.block;

import hexirp.Named;
import hexirp.annotation.NonNull;
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
	/** ブロック. */
	private final NamedBlock<@NonNull ?> block;
	
	/**
	 * Setter.
	 *
	 * @param block 名前付きブロック
	 * @param <Type> 名前付きブロック
	 */
	public <Type extends Block & Named> LoadableBlock(final Type block) {
		this.block = new NamedBlock<>(block);
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