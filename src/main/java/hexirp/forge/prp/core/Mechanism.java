package hexirp.forge.prp.core;

import hexirp.forge.Index;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;

/**
 * PRP-Coreにより追加されるメカニズム群、つまりアイテムやレシピなどを表現する.
 *
 * @author Hexirp
 */
public class Mechanism {
	/**
	 * PRP-Coreのメカニズム群を追加する.
	 *
	 * @param env 追加する環境
	 */
	public void add(final Environment env) {
		final Index<MinecraftItem> items = new Items().load(env);
		final Index<MinecraftItem> blocks = new Blocks().load(env);
		
		new Recipes(items.merge(blocks)).register();
	}
}