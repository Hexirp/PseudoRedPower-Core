package hexirp.forge.loadable;

import hexirp.annotation.Method.Getting;

/**
 * 名前を持つことを表す.
 *
 * @author Hexirp
 */
public interface Named {
	/**
	 * 名前を取得する.
	 *
	 * @return 名前
	 */
	@Getting
	public String name();
}
