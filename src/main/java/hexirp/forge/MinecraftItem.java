package hexirp.forge;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * {@link Item}を表現する.
 *
 * {@link Item}と{@link Block}を統一的に取り扱うために作成された。
 *
 * @author Hexirp
 */
public class MinecraftItem {
	/** アイテム. */
	private final Item obj;

	/**
	 * Setter.
	 *
	 * @param item {@link #obj}
	 */
	@Setting
	public MinecraftItem(@Nullable final Item item) {
		if (null == item) throw null;
		obj = item;
	}

	/**
	 * ブロックもアイテムとして取り扱うことが出来るため、受け付ける.
	 *
	 * @param block {@link #obj}
	 */
	@Setting
	public MinecraftItem(@Nullable final Block block) {
		this(Item.getItemFromBlock(block));
	}

	/**
	 * 内部のアイテムを取得する.
	 *
	 * @return {@link #obj}
	 */
	@Getting
	public Item item() {
		return obj;
	}
}
