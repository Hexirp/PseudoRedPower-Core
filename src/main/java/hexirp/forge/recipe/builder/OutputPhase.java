package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;

/**
 * 結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OutputPhase extends Phase<Unit, MinecraftItem, SizePhase, Integer> {
	/**
	 * @param value {@link #value}
	 */
	@Setting
	public OutputPhase(final MinecraftItem value) {
		super(Unit.$(), value);
	}
	
	@Override
	@Getting
	public SizePhase to(final Integer value) {
		return new SizePhase(this.value, value);
	}
}
