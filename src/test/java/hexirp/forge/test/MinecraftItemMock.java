package hexirp.forge.test;

import hexirp.annotation.Setting;
import hexirp.forge.MinecraftItem;

/**
 * {@link MinecraftItem}のテストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class MinecraftItemMock extends MinecraftItem {
	/**
	 * @param item アイテムの代理
	 */
	@Setting
	public MinecraftItemMock(final ItemMock item) {
		super(item);
	}
}
