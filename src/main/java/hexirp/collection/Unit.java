package hexirp.collection;

import hexirp.annotation.Getting;

/**
 * ユニット型.
 *
 * @author Hexirp
 */
public final class Unit {
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
