package hexirp.forge.recipe.test;

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
	 * @param str アイテムの代理
	 */
	public MinecraftItemMock(String str) {
		super(new ItemMock(str));
	}
}
