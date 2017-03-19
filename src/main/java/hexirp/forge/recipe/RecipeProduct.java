package hexirp.forge.recipe;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.ItemStack;

/**
 * レシピの結果を表現する.
 *
 * @author Hexirp
 */
public class RecipeProduct {
	/** 生成物. */
	private final MinecraftItem output;
	
	/** 生成数. */
	private final int size;
	
	/**
	 * @return ItemStackでの結果
	 */
	@Getting
	public ItemStack product() {
		return new ItemStack(output.item(), size);
	}
	
	/**
	 * @param output {@link #output}
	 * @param size {@link #size}
	 */
	@Setting
	public RecipeProduct(final MinecraftItem output, final int size) {
		this.output = output;
		this.size = size;
	}
}
