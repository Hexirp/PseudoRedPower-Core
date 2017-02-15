package com.github.hexirp.forge.loadable.block;

import com.github.hexirp.annotation.NonNull;
import com.github.hexirp.forge.loadable.item.Environment;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;

/**
 * ブロックのリソースの箇所を表現する.
 *
 * @author Hexirp
 */
public class BlockResourceLocation {
	/** リソースが表現するブロック. */
	private final NamedBlock<@NonNull ?> block;
	
	/**
	 * Setter.
	 *
	 * @param block {@link #block}
	 */
	public BlockResourceLocation(final NamedBlock<@NonNull ?> block) {
		this.block = block;
	}
	
	/**
	 * ブロックのリソースの箇所を登録する.
	 *
	 * @param env 登録する環境
	 */
	public void set(final Environment env) {
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(block.get()),
		    0,
		    env.location(block.get().name(), "inventory"));
	}
}