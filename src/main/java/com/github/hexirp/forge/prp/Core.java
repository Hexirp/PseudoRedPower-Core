package com.github.hexirp.forge.prp;

import com.github.hexirp.forge.prp.core.Items;
import com.github.hexirp.forge.prp.core.Metadata;
import com.github.hexirp.forge.prp.core.Recipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスはPseudoRedPower-Coreの情報を定義する.
 *
 * <p>
 * 警告: 「神クラス」にならないように.
 * </p>
 *
 * @author Hexirp
 */
@Mod(modid = Metadata.MOD_ID, useMetadata = true)
public final class Core {
	@Mod.Metadata
	public static ModMetadata metadata;
	
	/**
	 * 初期化前処理を行う.
	 *
	 * @param event イベントモデルによる初期化前処理イベント
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Metadata.set(metadata);
		
		new Recipes().add();
		
		new Items(event).add();
	}
}