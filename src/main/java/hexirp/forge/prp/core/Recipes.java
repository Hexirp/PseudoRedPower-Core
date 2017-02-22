package hexirp.forge.prp.core;

import hexirp.forge.RegisterableLibrary;
import hexirp.forge.prp.core.recipes.ChainMail;

/**
 * PRP-Coreにより追加されるレシピ群を定義する.
 *
 * @author Hexirp
 */
public class Recipes extends RegisterableLibrary {
	/**
	 * 初期化する.
	 */
	public Recipes() {
		add(new ChainMail());
	}
}