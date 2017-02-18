package hexirp.forge.recipe.builder;

import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;

/**
 * 製錬レシピの経験値を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class SmeltingExpPhase
    extends
        StackedPhase<SmeltingIngaPhase>
    implements
        SimpleTransitional<SmeltingRecipe> {
	/** 製錬レシピの経験値. */
	private final SmeltingRecipeExp exp;
	
	/**
	 * Setter.
	 *
	 * @param phase 前段階
	 * @param exp 経験値
	 */
	public SmeltingExpPhase(final SmeltingIngaPhase phase, final SmeltingRecipeExp exp) {
		super(phase);
		this.exp = exp;
	}
	
	@Override
	public SmeltingRecipe to() {
		return new SmeltingRecipe(previous().previous(), exp);
	}
}