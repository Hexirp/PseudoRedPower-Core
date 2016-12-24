package com.github.hexirp.minecraft.prp.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * このクラスはMODの情報を定義する.
 *
 * <p>
 * 警告: 「神クラス」にならないように.
 * </p>
 *
 * @author Hexirp
 */
@Mod(modid = Main.MOD_ID, name = Main.NAME,
    version = Main.VERSION)
public final class Main {
	/** MODの短縮名. */
	public static final String MOD_ID = "prp_core"; //"${id}";
	
	/** MODの名前. */
	public static final String NAME = "PseudoRedPower-Core"; //"${name}";
	
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
	public static final String VERSION = "1.0.0.0"; //"${version}";
	
	/**
	 * 初期化前処理を行う.
	 *
	 * @param event イベントモデルによる初期化前処理イベント
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		new Recipes().add();
		
		new Items(event).add();
	}
}