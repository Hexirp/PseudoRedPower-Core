package hexirp.forge.recipe;

import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 定型レシピを表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipe implements Registerable {
	/** レシピの結果. */
	private final RecipeProduct product;
	
	/** レシピの並べ方. */
	private final ShapedRecipeOrder order;
	
	/**
	 * Setter.
	 *
	 * @param item {@link #product}
	 * @param input {@link #order}
	 */
	public ShapedRecipe(RecipeProduct item, ShapedRecipeOrder input) {
		product = item;
		order = input;
	}
	
	@Override
	public final void register() {
		GameRegistry.addRecipe(product.product(), order.calc());
	}
}
