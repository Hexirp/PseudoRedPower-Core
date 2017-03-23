package hexirp.forge.smelting;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;

/**
 * 製錬レシピにおいて、経験値が得られる確率の目安を表現する.
 *
 * 詳しい仕様は「精錬していくと少数部分も含めて経験値がたまっていき、GUIを開いた時に整数部分は全て得られ、小数部分は確率的に0か1に変換される」となっているようだ。
 *
 * @author Hexirp
 */
public class SmeltingRecipeExp extends TwoFields<Integer, Integer> {
	/**
	 * @param first 基準と同じ回数製錬した時に得られる経験値
	 * @param second 製錬回数の基準
	 */
	@Setting
	public SmeltingRecipeExp(final Integer first, final Integer second) {
		super(first, second);
	}
	
	/**
	 * @return 少数に変換された経験値
	 */
	@Getting
	public float value() {
		return (float) first / (float) second;
	}
}
