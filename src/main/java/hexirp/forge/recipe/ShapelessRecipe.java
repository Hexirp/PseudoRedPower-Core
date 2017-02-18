package hexirp.forge.recipe;

import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 不定形のレシピを表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipe implements Registerable {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの材料. */
	private final ShapelessRecipeMaterial order;
	
	/**
	 * Setter.
	 *
	 * @param item {@link #product}
	 * @param input {@link #order}
	 */
	public ShapelessRecipe(RecipeProduct item, ShapelessRecipeMaterial input) {
		product = item;
		order = input;
	}
	
	@Override
	public void register() {
		GameRegistry.addShapelessRecipe(product.product(), order.calc());
	}
}
