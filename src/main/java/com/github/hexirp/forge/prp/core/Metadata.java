package com.github.hexirp.forge.prp.core;

import com.github.hexirp.forge.prp.core.metadata.Subdata;

import net.minecraftforge.fml.common.ModMetadata;

/**
 * PRP-Coreの情報を表現する. このクラスは設定そのものであるため、設定を受け取って動的に変化したりはしない。
 *
 * @author Hexirp
 */
public final class Metadata implements DateSetter {
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
	
	@Override
	public void set(ModMetadata metadata) {
		metadata.modId = MOD_ID;
		metadata.name = NAME;
		metadata.version = VERSION;
		metadata.authorList.add("Hexirp");
		metadata.autogenerated = false;
		
		new Subdata().set(metadata);
	}
}
