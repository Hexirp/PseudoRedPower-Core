package com.github.hexirp.forge.loadable.block;

import com.github.hexirp.Named;
import com.github.hexirp.forge.Registerable;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 名前付きブロックを表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きブロック
 */
public class NamedBlock<Type extends Block & Named> implements Registerable {
	/** 保存する値. */
	private final Type value;
	
	/**
	 * Setter.
	 *
	 * @param value {@link #value}
	 */
	public NamedBlock(final Type value) {
		this.value = value;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #value}
	 */
	public Type get() {
		return value;
	}
	
	@Override
	public void register() {
		GameRegistry.registerBlock(value, value.name());
	}
}