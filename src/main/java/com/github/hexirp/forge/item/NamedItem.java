package com.github.hexirp.forge.item;

import com.github.hexirp.Named;

import net.minecraft.item.Item;

/**
 * 名前付きアイテムを表現する.
 *
 * @author Hexirp
 * @param <Type> 保存する型
 */
public class NamedItem<Type extends Item & Named> implements Named {
	/** 保存する値. */
	private final Type t;
	
	/**
	 * Setter.
	 *
	 * @param t {@link #t}
	 */
	public NamedItem(final Type t) {
		this.t = t;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #t}
	 */
	public Item get() {
		return t;
	}
	
	@Override
	public String name() {
		return t.name();
	}
}