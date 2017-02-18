package hexirp.forge.recipe.builder;

import hexirp.forge.MinecraftItem;

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
	 * 製錬レシピの因果関係を定義する段階に移行する.
	 *
	 * @param product 結果
	 * @param material 材料
	 * @return 次の段階
	 * @see SmeltingIngaPhase#SmeltingIngaPhase(MinecraftItem, MinecraftItem)
	 */
	public SmeltingIngaPhase inga(final MinecraftItem product, final MinecraftItem material) {
		return new SmeltingIngaPhase(product, material);
	}
}