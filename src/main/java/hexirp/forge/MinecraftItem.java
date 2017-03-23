package hexirp.forge;

import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;
import hexirp.collection.OneField;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * {@link Item}を表現する.
 *
 * {@link Item}と{@link Block}を統一的に取り扱うために作成された。
 *
 * @author Hexirp
 */
public class MinecraftItem extends OneField<Item> {
	/**
	 * @param item アイテム
	 */
	@Setting
	public MinecraftItem(@Nullable final Item item) {
		super(item);
	}
	
	/**
	 * @param block ブロック(事実上アイテムを継承している)
	 */
	@Setting
	public MinecraftItem(@Nullable final Block block) {
		this(Item.getItemFromBlock(block));
	}
	
	/**
	 * @return アイテム
	 */
	@Getting
	public Item item() {
		return value;
	}
}
