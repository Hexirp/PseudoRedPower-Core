package hexirp.forge.recipe;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.collection.ListUtil;
import hexirp.forge.MinecraftItem;
import net.minecraft.item.Item;

/**
 * 不定形レシピの材料を表現する.
 *
 * @author Hexirp
 */
public class ShapelessRecipeMaterial {
	/** 不定形レシピの材料. */
	private final List<Item> list = new LinkedList<>();
	
	/**
	 * @return 材料の配列
	 */
	@Getting
	public Object[] array() {
		return new ListUtil<Item>().merge(list).array();
	}
	
	/**
	 * 材料を追加する.
	 *
	 * @param obj 材料の種類
	 * @param n 材料の個数。0以上でなければならない
	 * @return this
	 */
	@Chaining
	public ShapelessRecipeMaterial add(final MinecraftItem obj, final int n) {
		for (int india = 0; india < n; india++)
			list.add(obj.item());
		
		return this;
	}
}
