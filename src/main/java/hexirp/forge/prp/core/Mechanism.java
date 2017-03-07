package hexirp.forge.prp.core;

import hexirp.annotation.Method.Command;
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
	@Command
	public void add(final Environment env) {
		final Index<MinecraftItem> ores = new Ores().load(env);
		
		new Recipes().register();
		new OresRecipes(ores).register();
	}
}
