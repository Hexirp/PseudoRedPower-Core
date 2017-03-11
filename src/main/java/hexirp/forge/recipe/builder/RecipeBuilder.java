package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.BranchedPhase;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * レシピを定義するための補助クラスを表現する.
 *
 * @author Hexirp
 */
public class RecipeBuilder extends BranchedPhase<Unit, Unit, OutputPhase, MinecraftItem, SmeltingProductPhase, MinecraftItem> {
	/** Setting. */
	@Setting
	public RecipeBuilder() {
		super(Unit.$(), Unit.$());
	}
	
	@Override
	@Getting
	public OutputPhase to(final MinecraftItem value) {
		return new OutputPhase(value);
	}
	
	@Override
	public SmeltingProductPhase to2(final MinecraftItem value) {
		return new SmeltingProductPhase(value);
	}
}
