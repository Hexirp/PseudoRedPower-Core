package hexirp.forge.recipe;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.ItemStack;

/**
 * レシピの結果を表現する.
 *
 * @author Hexirp
 */
public class RecipeProduct extends TwoFields<MinecraftItem, Integer> {
	/**
	 * @param first 結果となるアイテムの種類
	 * @param second 結果となるアイテムのスタック数
	 */
	@Setting
	public RecipeProduct(final MinecraftItem first, final Integer second) {
		super(first, second);
	}
	
	/**
	 * @return ItemStackでの結果
	 */
	@Getting
	public ItemStack product() {
		return new ItemStack(first.item(), second);
	}
}
