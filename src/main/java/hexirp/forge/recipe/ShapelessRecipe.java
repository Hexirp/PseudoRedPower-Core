package hexirp.forge.recipe;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 不定形のレシピを表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipe extends TwoFields<RecipeProduct, ShapelessRecipeMaterial> implements Registerable {
	/**
	 * @param first レシピの結果
	 * @param second レシピの材料
	 */
	@Setting
	public ShapelessRecipe(final RecipeProduct first, final ShapelessRecipeMaterial second) {
		super(first, second);
	}
	
	@Override
	@Command
	public void register() {
		GameRegistry.addShapelessRecipe(first.product(), second.array());
	}
}
