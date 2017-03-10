package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.StackedPhase;
import hexirp.forge.MinecraftItem;
import hexirp.forge.smelting.SmeltingRecipeExp;
import hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * 製錬レシピの因果関係を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SmeltingIngaPhase extends StackedPhase<SmeltingRecipeInga> {
	/**
	 * @param product 結果
	 * @param material 材料
	 * @see SmeltingRecipeInga#SmeltingRecipeInga(MinecraftItem, MinecraftItem)
	 */
	@Setting
	public SmeltingIngaPhase(final MinecraftItem product, final MinecraftItem material) {
		super(new SmeltingRecipeInga(product, material));
	}
	
	/**
	 * @param exp 分子
	 * @param times 分母
	 * @return 製錬レシピの経験値を定義する段階
	 * @see SmeltingExpPhase#SmeltingExpPhase(SmeltingIngaPhase, SmeltingRecipeExp)
	 */
	@Getting
	public SmeltingExpPhase exp(final int exp, final int times) {
		return new SmeltingExpPhase(this, new SmeltingRecipeExp(exp, times));
	}
}
