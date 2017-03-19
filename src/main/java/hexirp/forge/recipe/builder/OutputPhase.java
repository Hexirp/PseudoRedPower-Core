package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.Phase;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * 結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OutputPhase extends Phase<Unit, MinecraftItem, SizePhase, Integer> {
	/**
	 * @param value この段階で保存する値
	 */
	@Setting
	public OutputPhase(final MinecraftItem value) {
		super(Unit.$(), value);
	}

	@Override
	@Getting
	public SizePhase to(final Integer value) {
		return new SizePhase(second(), value);
	}
}
