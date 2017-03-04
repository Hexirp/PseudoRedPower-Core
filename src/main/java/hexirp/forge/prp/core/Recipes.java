package hexirp.forge.prp.core;

import hexirp.annotation.Method.Setting;
import hexirp.forge.RegisterableLibrary;

/**
 * PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 */
	@Setting
	public Recipes() {
		add(new ChainMail());
	}
}
