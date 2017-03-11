package hexirp.forge.recipe.builder;

import hexirp.forge.MinecraftItem;

/**
 * 結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OutputPhase {
	/** 保存するフィールド */
	private final MinecraftItem value;
	
	/**
	 * @param value 結果
	 */
	public OutputPhase(final MinecraftItem value) {
		this.value = value;
	}
}
