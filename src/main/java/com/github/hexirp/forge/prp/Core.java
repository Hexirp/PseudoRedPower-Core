package com.github.hexirp.forge.prp;

import com.github.hexirp.annotation.Nullable;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.prp.core.Items;
import com.github.hexirp.forge.prp.core.Metadata;
import com.github.hexirp.forge.prp.core.Recipes;
import com.github.hexirp.forge.prp.core.Smeltings;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスはPseudoRedPower-Coreの情報を定義する.
 *
 * @author Hexirp
 */
@Mod(modid = Metadata.MOD_ID, name = Metadata.NAME, version = Metadata.VERSION, // 最小限の定義
    useMetadata = true)
public final class Core {
	/** MODの情報. Forgeにより初期化されるため、自分では初期化しない. */
	@Mod.Metadata
	@Nullable
	public static ModMetadata metadata;
	
	/**
	 * 初期化前処理を行う.
	 *
	 * @param event イベントモデルによる初期化前処理イベント
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Forgeによるmetadataへの代入
		
		Metadata.set(metadata);
		
		new Items().load(new Environment(metadata, event));
		
		new Recipes().register();
		
		new Smeltings().register();
	}
}