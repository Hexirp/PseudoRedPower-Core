package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;

/**
 * 結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OutputPhase {
	/** 保存する値. */
	private final MinecraftItem value;
	
	/**
	 * @param value {@link #value}
	 */
	@Setting
	public OutputPhase(final MinecraftItem value) {
		this.value = value;
	}
	
	/**
	 * @param value 数量
	 * @return {@link SizePhase}-次の段階
	 */
	@Getting
	public SizePhase to(final Integer value) {
		return new SizePhase(this.value, value);
	}
}
