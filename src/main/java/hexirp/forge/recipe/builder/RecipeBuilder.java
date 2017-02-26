package hexirp.forge.recipe.builder;

import java.util.function.Function;

import hexirp.forge.MinecraftItem;
import hexirp.forge.smelting.SmeltingRecipe;
import hexirp.forge.smelting.SmeltingRecipeExp;
import hexirp.forge.smelting.SmeltingRecipeInga;

/**
 * レシピを定義するための補助クラスを表現する.
 *
 * @author Hexirp
 */
public class RecipeBuilder {
	/**
	 * レシピのBuilderを返す.
	 *
	 * @return レシピのBuilder
	 */
	public Function<MinecraftItem, Function<Integer, ProductPhase>> product() {
		return t0 -> t1 -> new ProductPhase(t0, t1);
	}
	
	/**
	 * 精錬レシピのBuilderを返す.
	 *
	 * @return 精錬レシピのBuilder
	 */
	public Function<MinecraftItem, Function<MinecraftItem, Function<Integer, Function<Integer, SmeltingRecipe>>>> smelting() {
		return t0 -> t1 -> t2 -> t3 -> new SmeltingRecipe(new SmeltingRecipeInga(t0, t1), new SmeltingRecipeExp(t2, t3));
	}
}
