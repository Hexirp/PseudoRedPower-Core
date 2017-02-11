package com.github.hexirp.forge.block;

import com.github.hexirp.Named;
import com.github.hexirp.annotation.NonNull;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.Loadable;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.MinecraftItem;

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
	 */
	public <Type extends Block & Named> LoadableBlock(final Type block) {
		this.block = new NamedBlock<>(block);
	}
	
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(block.get(), block.get().name());
		
		new BlockResourceLocation(block).set(env);;
		
		return new Index<MinecraftItem>().put(block.get().name(), new MinecraftItem(block.get()));
	}
}