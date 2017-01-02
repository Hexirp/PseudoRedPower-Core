package com.github.hexirp.forge.smelting;

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
	 * コントストラクタ
	 *
	 * @param exp 経験値
	 * @param times 回数
	 */
	public SmeltingRecipeExp(int exp, int times) {
		this.exp = exp;
		this.times = times;
	}
	
	/**
	 * 少数への変換.
	 *
	 * @return 少数に変換された経験値
	 */
	public float calc() {
		return (float) exp / (float) times;
	}
}