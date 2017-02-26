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
	 * 結果を定義する段階に移行する.
	 *
	 * @param output 作成物の種類
	 * @param size 作成物の数
	 * @return 結果を定義する段階
	 * @see ProductPhase#ProductPhase(MinecraftItem, int)
	 */
	public ProductPhase product(final MinecraftItem output, final int size) {
		return new ProductPhase(output, size);
	}
	
	/**
	 * TODO: ラムダを使用するBuilderのテスト.
	 *
	 * @return ラムダを使用したBuilder
	 */
	public Function<MinecraftItem, Function<MinecraftItem, Function<Integer, Function<Integer, SmeltingRecipe>>>> smelting() {
		return t0 -> t1 -> t2 -> t3 -> new SmeltingRecipe(new SmeltingRecipeInga(t0, t1), new SmeltingRecipeExp(t2, t3));
	}
}
