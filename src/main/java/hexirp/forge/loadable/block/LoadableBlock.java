package hexirp.forge.loadable.block;

import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;
import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * ロード可能なブロックを表現する.
 *
 * @author Hexirp
 * @param <Type> 名前つきブロック
 */
public class LoadableBlock<Type extends Block & Named> extends NamedType<Type> implements Loadable {
	/**
	 * Setter.
	 *
	 * @param block 名前付きブロック
	 */
	public LoadableBlock(final Type block) {
		super(block);
	}
	
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(this.value(), this.name());
		
		new BlockResourceLocation(this).set(env);
		
		return new Index<MinecraftItem>().put(
		    this.name(),
		    new MinecraftItem(this.value()));
	}
}