package hexirp.forge.recipe.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.Phase;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;

/**
 * 製錬レシピの結果を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SmeltingProductPhase extends Phase<Unit, MinecraftItem, SmeltingMaterialPhase, MinecraftItem> {
	/**
	 * @param value 保存する値
	 */
	@Setting
	public SmeltingProductPhase(final MinecraftItem value) {
		super(Unit.$(), value);
	}
	
	@Override
	@Getting
	public SmeltingMaterialPhase to(final MinecraftItem value) {
		return new SmeltingMaterialPhase(second, value);
	}
}
