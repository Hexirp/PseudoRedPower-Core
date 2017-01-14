package com.github.hexirp.forge.prp.core;

import net.minecraftforge.fml.common.ModMetadata;

/**
 * MODの情報を表現する. このクラスは設定そのものであるため、設定を受け取って動的に変化したりはしない。
 *
 * @author Hexirp
 */
public final class Metadata {
	/** MODの短縮名. それぞれのMODを区別する絶対的な文字列。 */
	public static final String MOD_ID = "prp_core";
	
	/** MODの名前. */
	public static final String NAME = "PseudoRedPower-Core";
	
	/**
	 * MODのバージョン.
	 *
	 * <h2>更新基準:</h2>
	 * <ul>
	 * <li>第一レベルは対応するMinecraft本体のバージョンの上昇、メカニズムの削除など</li>
	 * <li>第二レベルは大規模なメカニズムの導入、バージョンの壁をもたらす変更など</li>
	 * <li>第三レベルは小規模なメカニズムの導入、大きな変更をもたらすバグの修正など</li>
	 * <li>第四レベルはバグの修正など</li>
	 * </ul>
	 */
	public static final String VERSION = "0.0.0.0";
	
	/** MODの解説. */
	private static final String DESCRIPTION =
	    "PseudoRedPower-Core is the copied RedPower2 to 1.8.9 or later. So, if you think that this MOD is interesting, respect the author of RedPower2.";
	
	/** MODのホームページ. */
	private static final String URL = "https://github.com/Hexirp/PseudoRedPower-Core";
	
	/**
	 * MODの情報を設定する.
	 *
	 * @param metadata 設定する対象
	 */
	public static final void set(ModMetadata metadata) {
		metadata.modId = MOD_ID;
		metadata.name = NAME;
		metadata.version = VERSION;
		metadata.description = DESCRIPTION;
		metadata.authorList.add("Hexirp");
		metadata.url = URL;
		metadata.autogenerated = false;
	}
}
