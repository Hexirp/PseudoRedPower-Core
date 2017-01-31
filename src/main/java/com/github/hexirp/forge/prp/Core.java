package com.github.hexirp.forge.prp;

import com.github.hexirp.annotation.Nullable;
import com.github.hexirp.forge.item.Environment;
import com.github.hexirp.forge.prp.core.Mechanism;
import com.github.hexirp.forge.prp.core.Metadata;

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
@Mod(
    modid = Metadata.MOD_ID,
    name = Metadata.NAME,
    version = Metadata.VERSION,
    useMetadata = true)
public class Core {
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
	@SuppressWarnings("null")
	@Mod.EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		new Metadata().set(metadata);
		
		final Environment env = new Environment(metadata, event);
		
		new Mechanism().add(env);
	}
}