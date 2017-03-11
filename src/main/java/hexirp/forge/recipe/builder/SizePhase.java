package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;

/**
 * 数量を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SizePhase {
	/** 段階の記録. */
	protected final MinecraftItem stack;
	
	/** 保存する値. */
	protected final Integer value;
	
	/**
	 * @param stack {@link #stack}
	 * @param value {@link #value}
	 */
	@Setting
	public SizePhase(final MinecraftItem stack, final Integer value) {
		this.stack = stack;
		this.value = value;
	}
}
