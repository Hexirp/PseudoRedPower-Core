package hexirp.forge.loadable;

import hexirp.annotation.Getting;

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
}
