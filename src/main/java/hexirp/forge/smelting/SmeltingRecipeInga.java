package hexirp.forge.smelting;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.ItemStack;

/**
 * 材料と結果の対応を表現する.
 *
 * 原因と結果の結びつきを意味する因果から名前を取っている。
 *
 * @author Hexirp
 */
public class SmeltingRecipeInga {
	/** 結果. */
	private final MinecraftItem product;

	/** 材料. */
	private final MinecraftItem material;

	/**
	 * @param product {@link #product}
	 * @param material {@link #material}
	 */
	@Setting
	public SmeltingRecipeInga(final MinecraftItem product, final MinecraftItem material) {
		this.product = product;
		this.material = material;
	}

	/**
	 * @return 結果
	 */
	@Getting
	public ItemStack product() {
		return new ItemStack(product.item());
	}

	/**
	 * @return 材料
	 */
	@Getting
	public ItemStack material() {
		return new ItemStack(material.item());
	}
}
