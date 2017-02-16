package com.github.hexirp.forge.loadable.block;

import com.github.hexirp.Named;
import com.github.hexirp.annotation.NonNull;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.Loadable;
import com.github.hexirp.forge.MinecraftItem;
import com.github.hexirp.forge.loadable.Environment;

import net.minecraft.block.Block;

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
		block.register();
		
		new BlockResourceLocation(block).set(env);
		
		return new Index<MinecraftItem>().put(
		    block.get().name(),
		    new MinecraftItem(block.get()));
	}
}