package com.github.hexirp.forge.block;

import com.github.hexirp.Named;
import com.github.hexirp.forge.Index;
import com.github.hexirp.forge.Loadable;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.item.MinecraftItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * ロード可能なブロックを表現する.
 *
 * @author Hexirp
 */
public class LoadableBlock implements Loadable {
	/** ブロック. */
	private final Block block;
	
	/** ブロックの名前. */
	private final String name;
	
	/**
	 * Setter.
	 *
	 * @param block 名前付きブロック
	 */
	public <NamedBlock extends Block & Named> LoadableBlock(final NamedBlock block) {
		this.block = block;
		this.name = block.name();
	}
	
	@Override
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(block, name);
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(
		    Item.getItemFromBlock(block),
		    0,
		    env.location(name, "inventory"));
		
		return new Index<MinecraftItem>().put(name, new MinecraftItem(block));
	}
}