package com.github.hexirp.forge.block;

import com.github.hexirp.Named;

import net.minecraft.block.Block;

/**
 * 名前付きブロックを表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きブロック
 */
public class NamedBlock<Type extends Block & Named> {
	/** 保存する値. */
	private final Type t;
	
	/**
	 * Setter.
	 *
	 * @param t {@link #t}
	 */
	public NamedBlock(final Type t) {
		this.t = t;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #t}
	 */
	public Type get() {
		return t;
	}
}