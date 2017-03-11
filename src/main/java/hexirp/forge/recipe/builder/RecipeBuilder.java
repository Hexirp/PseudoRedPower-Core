package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.Phase;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * レシピを定義するための補助クラスを表現する.
 *
 * @author Hexirp
 */
public class RecipeBuilder extends Phase<Unit, Unit, OutputPhase, MinecraftItem> {
	/** Setting. */
	@Setting
	public RecipeBuilder() {
		super(Unit.$(), Unit.$());
	}
	
	/**
	 * 製錬レシピの因果関係を定義する段階に移行する.
	 *
	 * @param product 結果
	 * @param material 材料
	 * @return 次の段階
	 * @see SmeltingIngaPhase#SmeltingIngaPhase(MinecraftItem, MinecraftItem)
	 */
	public SmeltingIngaPhase inga(final MinecraftItem product, final MinecraftItem material) {
		return new SmeltingIngaPhase(product, material);
	}
	
	@Override
	@Getting
	public OutputPhase to(final MinecraftItem value) {
		return new OutputPhase(value);
	}
}
