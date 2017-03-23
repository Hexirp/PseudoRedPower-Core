package hexirp.forge.recipe;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 定型レシピを表現する.
 *
 * @author Hexirp
 */
public class ShapedRecipe extends TwoFields<RecipeProduct, ShapedRecipeOrder> implements Registerable {
	/**
	 * @param first レシピの結果
	 * @param second レシピの並べ方
	 */
	@Setting
	public ShapedRecipe(final RecipeProduct first, final ShapedRecipeOrder second) {
		super(first, second);
	}
	
	@Override
	@Command
	public final void register() {
		GameRegistry.addRecipe(first.product(), second.array());
	}
}
