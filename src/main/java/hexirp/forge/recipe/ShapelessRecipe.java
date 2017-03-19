package hexirp.forge.recipe;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
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
	 * @param item {@link #product}
	 * @param input {@link #order}
	 */
	@Setting
	public ShapelessRecipe(final RecipeProduct item, final ShapelessRecipeMaterial input) {
		product = item;
		order = input;
	}
	
	@Override
	@Command
	public void register() {
		GameRegistry.addShapelessRecipe(product.product(), order.array());
	}
}
