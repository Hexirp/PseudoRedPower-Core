package hexirp.forge.prp;

import hexirp.annotation.Command;
import hexirp.annotation.Nullable;
import hexirp.forge.loadable.Environment;
import hexirp.forge.prp.core.Mechanism;
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
	@Mod.EventHandler
	@Command
	public void preInit(final @Nullable FMLPreInitializationEvent event) {
		final @Nullable ModMetadata localData = metadata; // この時点でのメタデータを確定させる
		
		if (null == localData || null == event) throw null;
		
		new Metadata().set(localData); // メタデータに設定する
		
		final Environment env = new Environment(localData, event); // 環境をセットする
		
		new Mechanism().add(env); // 様々な物を追加する
	}
}
