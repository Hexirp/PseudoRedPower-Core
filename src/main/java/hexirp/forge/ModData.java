package hexirp.forge;

import hexirp.annotation.Command;
import net.minecraftforge.fml.common.ModMetadata;

/**
 * MODの設定を表現する.
 *
 * @author Hexirp
 *
 */
public interface ModData {
	/**
	 * MODの情報を設定する.
	 *
	 * @param metadata 設定する対象
	 */
	@Command
	public void set(ModMetadata metadata);
}
