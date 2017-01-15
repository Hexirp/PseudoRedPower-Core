package com.github.hexirp.forge.prp.core;

import net.minecraftforge.fml.common.ModMetadata;

/**
 * MODの設定を表現する.
 *
 * @author Hexirp
 *
 */
public interface DateSetter {
	/**
	 * MODの情報を設定する.
	 *
	 * @param metadata 設定する対象
	 */
	public void set(ModMetadata metadata);
}