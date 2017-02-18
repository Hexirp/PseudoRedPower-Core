package hexirp.forge;

import hexirp.forge.loadable.Environment;

/**
 * 自分自身を読み込ませられる事を表現する.
 *
 * @author Hexirp
 */
@FunctionalInterface
public interface Loadable {
	/**
	 * 自分自身を読み込ませる.
	 *
	 * @param env 読み込ませる環境
	 * @return 辞書
	 */
	public Index<MinecraftItem> load(Environment env);
}