package hexirp.forge.smelting;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.ItemStack;

/**
 * 材料と結果の対応を表現する.
 *
 * 原因と結果の結びつきを意味する因果から名前を取っている。
 *
 * @author Hexirp
 */
public class SmeltingRecipeInga extends TwoFields<MinecraftItem, MinecraftItem> {
	/**
	 * @param first 完成物
	 * @param second 材料
	 */
	@Setting
	public SmeltingRecipeInga(final MinecraftItem first, final MinecraftItem second) {
		super(first, second);
	}
	
	/**
	 * @return 結果
	 */
	@Getting
	public ItemStack product() {
		return new ItemStack(first.item());
	}
	
	/**
	 * @return 材料
	 */
	@Getting
	public ItemStack material() {
		return new ItemStack(second.item());
	}
}
