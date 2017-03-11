package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;

/**
 * ユニット型.
 *
 * @author Hexirp
 */
public class Unit {
	/** シングルトン. */
	private final static Unit singleton = new Unit();
	
	/** 隠蔽されたコントストラクタ. */
	private Unit() {};
	
	/**
	 * @return シングルトン
	 */
	@Getting
	public final static Unit $() {
		return singleton;
	}
}
