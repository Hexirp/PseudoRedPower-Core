package hexirp.forge.smelting;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.Registerable;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 製錬レシピを表現する.
 *
 * @author Hexirp
 */
public class SmeltingRecipe extends TwoFields<SmeltingRecipeInga, SmeltingRecipeExp> implements Registerable {
	/**
	 * @param first 材料と結果
	 * @param second 経験値が得られる確率
	 */
	@Setting
	public SmeltingRecipe(final SmeltingRecipeInga first, final SmeltingRecipeExp second) {
		super(first, second);
	}
	
	@Override
	@Command
	public void register() {
		GameRegistry.addSmelting(first.material(), first.product(), second.value());
	}
}
