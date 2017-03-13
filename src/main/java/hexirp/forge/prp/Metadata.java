package hexirp.forge.prp;

import hexirp.annotation.Method.Command;
import hexirp.forge.ModData;
import net.minecraftforge.fml.common.ModMetadata;

/**
 * PRP-Coreの情報を表現する.
 *
 * @author Hexirp
 */
final class Metadata implements ModData {
	/** MODの短縮名. それぞれのMODを区別する絶対的な文字列。 */
	static final String MOD_ID = "prp_core";
	
	/** MODの名前. */
	static final String NAME = "PseudoRedPower-Core";
	
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
	static final String VERSION = "0.0.0.0";
	
	@Override
	@Command
	public void set(final ModMetadata metadata) {
		metadata.modId = MOD_ID;
		metadata.name = NAME;
		metadata.version = VERSION;
		metadata.authorList.add("Hexirp");
		metadata.autogenerated = false;
		
		new Subdata().set(metadata);
	}
}
