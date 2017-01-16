package com.github.hexirp.forge.prp;

import com.github.hexirp.annotation.Nullable;
import com.github.hexirp.forge.ItemIndex;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.prp.core.Items;
import com.github.hexirp.forge.prp.core.Metadata;
import com.github.hexirp.forge.prp.core.Recipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * PseudoRedPower-Coreの中心クラスを表現する.
 *
 * MinecraftForgeの要求により作成された。
 *
 * @author Hexirp
 */
@Mod(modid = Metadata.MOD_ID, name = Metadata.NAME, version = Metadata.VERSION, // 最小限の定義
    useMetadata = true)
public final class Core {
	/** MODの情報. Forgeにより初期化されるため、自分では初期化しない。 */
	@Mod.Metadata
	@Nullable
	public static ModMetadata metadata;
	
	/**
	 * 初期化前処理を行う.
	 *
	 * ここで行われる処理によりPRP-Coreがどういう物を含むか設定される。
	 *
	 * @param event イベントモデルによる初期化前処理イベント
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Forgeによるmetadataへの代入
		
		new Metadata().set(metadata);
		
		Environment env = new Environment(metadata, event);
		
		ItemIndex items = new Items().load(env);
		
		new Recipes(items).register();
	}
}