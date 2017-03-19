package hexirp.forge.smelting;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

/**
 * 製錬レシピにおいて、経験値が得られる確率の目安を表現する.
 *
 * 詳しい仕様は「精錬していくと少数部分も含めて経験値がたまっていき、GUIを開いた時に整数部分は全て得られ、小数部分は確率的に0か1に変換される」となっているようだ。
 *
 * @author Hexirp
 */
public class SmeltingRecipeExp {
	/** 基準と同じ回数製錬した時に得られる経験値. */
	private final int exp;
	
	/** 製錬回数の基準. */
	private final int times;
	
	/**
	 * @param exp {@link #exp}
	 * @param times {@link #times}
	 */
	@Setting
	public SmeltingRecipeExp(final int exp, final int times) {
		this.exp = exp;
		this.times = times;
	}
	
	/**
	 * @return 少数に変換された経験値
	 */
	@Getting
	public float value() {
		return (float) exp / (float) times;
	}
}
