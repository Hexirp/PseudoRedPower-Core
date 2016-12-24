package com.github.hexirp.forge.prp;

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
 * <p>
 * 警告: 「神クラス」にならないように.
 * </p>
 *
 * @author Hexirp
 */
@Mod(modid = Core.MOD_ID, name = Core.NAME, version = Core.VERSION, // 最小限の定義
    useMetadata = true)
public final class Core {
	/** MODの短縮名. それぞれのMODを区別する絶対的な文字列. */
	public static final String MOD_ID = "prp_core";
	
	/** MODの名前. */
	public static final String NAME = "PseudoRedPower-Core";
	
	/**
	 * MODのバージョン.
	 *
	 * <p>
	 * 更新基準:
	 * <ul>
	 * <li>第一レベル: 対応するMinecraft本体のバージョンの上昇、メカニズムの削除。</li>
	 * <li>第二レベル: 大規模なメカニズムの導入、バージョンの壁をもたらす変更。</li>
	 * <li>第三レベル: 小規模なメカニズムの導入、大きな変更をもたらすバグの修正。</li>
	 * <li>第四レベル: バグの修正。</li>
	 * </ul>
	 * </p>
	 */
	public static final String VERSION = "1.0.0.0";
	
	/**
	 * MODの情報. Forgeにより初期化されるため、自分では初期化しない.
	 */
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
		
		new Items(metadata, event).register();
		
		new Recipes().register();
		
		new Smeltings().register();
	}
}