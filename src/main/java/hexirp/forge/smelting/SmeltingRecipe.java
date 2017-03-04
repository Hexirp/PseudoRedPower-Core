package hexirp.forge.smelting;

import hexirp.annotation.Method.Setting;
import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 製錬レシピを表現する.
 *
 * @author Hexirp
 */
public class SmeltingRecipe implements Registerable {
	/** 材料と結果. */
	private final SmeltingRecipeInga inga;

	/** 経験値が得られる確率. */
	private final SmeltingRecipeExp exp;

	/**
	 * Setter.
	 *
	 * @param inga {@link #inga}
	 * @param exp {@link #exp}
	 */
	@Setting
	public SmeltingRecipe(final SmeltingRecipeInga inga, final SmeltingRecipeExp exp) {
		this.inga = inga;
		this.exp = exp;
	}

	@Override
	public void register() {
		GameRegistry.addSmelting(inga.material(), inga.product(), exp.value());
	}
}
