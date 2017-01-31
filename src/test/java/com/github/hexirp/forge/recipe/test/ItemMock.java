package com.github.hexirp.forge.recipe.test;

import com.github.hexirp.Named;
import com.github.hexirp.annotation.Nullable;

import net.minecraft.item.Item;

/**
 * テストのためのダミー.
 *
 * @author Hexirp
 */
public class ItemMock extends Item implements Named {
	/** 名前を表す. */
	private final String name;
	
	/**
	 * コントストラクタ.
	 *
	 * @param s 名前
	 */
	public ItemMock(final String s) {
		this.name = s;
	}
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public boolean equals(@Nullable final Object o) {
		return o instanceof ItemMock ? name == ((ItemMock) o).name : false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}