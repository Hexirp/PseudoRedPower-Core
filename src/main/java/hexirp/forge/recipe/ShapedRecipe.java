package hexirp.forge.recipe;

import hexirp.annotation.Method.Command;
import hexirp.annotation.Method.Setting;
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
	 * @param item {@link #product}
	 * @param input {@link #order}
	 */
	@Setting
	public ShapedRecipe(final RecipeProduct item, final ShapedRecipeOrder input) {
		product = item;
		order = input;
	}
	
	@Override
	@Command
	public final void register() {
		GameRegistry.addRecipe(product.product(), order.array());
	}
}
