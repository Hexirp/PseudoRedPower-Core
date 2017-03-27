package hexirp.forge.loadable;

import hexirp.annotation.Getting;
import hexirp.forge.Index;

/**
 * 名前を持つことを表す.
 *
 * @author Hexirp
 */
public interface Named {
	/**
	 * @return 名前
	 */
	@Getting
	public String name();
	
	/**
	 * @param index 索引
	 * @return 索引において、自分自身と同じ名前を持つ要素
	 */
	@Getting
	public default <Item> Item find(final Index<Item> index) {
		return index.lookup(this.name());
	}
}
