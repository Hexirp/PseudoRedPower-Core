package hexirp.forge.test;

import hexirp.forge.MinecraftItem;

/**
 * テストのためのダミー.
 *
 * @author Hexirp
 */
public class MinecraftItemMock extends MinecraftItem {
	/**
	 * コントストラクタ.
	 *
	 * @param item アイテムの代理
	 */
	public MinecraftItemMock(final ItemMock item) {
		super(item);
	}
}
