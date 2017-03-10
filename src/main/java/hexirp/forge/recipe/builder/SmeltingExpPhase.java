package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;

/**
 * 製錬レシピの経験値を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SmeltingExpPhase extends StackedPhase<SmeltingIngaPhase> implements SimpleTransitional<SmeltingRecipe> {
	/** 製錬レシピの経験値. */
	private final SmeltingRecipeExp exp;
	
	/**
	 * @param phase 前段階
	 * @param exp 経験値
	 */
	@Setting
	public SmeltingExpPhase(final SmeltingIngaPhase phase, final SmeltingRecipeExp exp) {
		super(phase);
		this.exp = exp;
	}
	
	@Override
	@Getting
	public SmeltingRecipe to() {
		return new SmeltingRecipe(previous().previous(), exp);
	}
}
