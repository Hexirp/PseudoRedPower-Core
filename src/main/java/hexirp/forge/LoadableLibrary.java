package hexirp.forge;

import hexirp.annotation.Method.Command;
import hexirp.forge.loadable.Environment;

/**
 * 要素一つ一つを読み込ませることが出来る{@link Library}を表現する.
 *
 * アイテムを追加するクラスを抽象化することにより作成された。
 *
 * @author Hexirp
 */
public abstract class LoadableLibrary extends Library<Loadable> implements Loadable {
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		final Index<MinecraftItem> ret = new Index<>();
		
		forEach(item -> ret.merge(item.load(env)));
		
		return ret;
	}
}
