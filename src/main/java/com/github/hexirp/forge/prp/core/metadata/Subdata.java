package com.github.hexirp.forge.prp.core.metadata;

import com.github.hexirp.forge.ModData;

import net.minecraftforge.fml.common.ModMetadata;

/**
 * PRP-Coreの細かい情報を定義する.
 *
 * @author Hexirp
 */
public class Subdata implements ModData {
	/** MODの解説. */
	private static final String DESCRIPTION =
	    "PseudoRedPower-Core is the salvaged RedPower2 to 1.8.9 or later. So, respect the author of RedPower2 if you think that this MOD is interesting.";
	
	/** MODのホームページ. */
	private static final String URL = "https://github.com/Hexirp/PseudoRedPower-Core";
	
	/**
	 * @param metadata 設定する対象
	 */
	@Override
	public void set(ModMetadata metadata) {
		metadata.description = DESCRIPTION;
		metadata.url = URL;
	}
}
