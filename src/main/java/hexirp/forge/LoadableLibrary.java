package hexirp.forge;

import hexirp.annotation.Command;
import hexirp.forge.loadable.Environment;

/**
 * 要素一つ一つを読み込ませることが出来る{@link Library}を表現する.
 *
 * @author Hexirp
 */
public class LoadableLibrary extends Library<Loadable> implements Loadable {
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		final Index<MinecraftItem> ret = new Index<>();
		
		forEach(item -> ret.merge(item.load(env)));
		
		return ret;
	}
}
