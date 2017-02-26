package hexirp.forge.test;

import hexirp.annotation.Nullable;
import net.minecraft.item.Item;

/**
 * テストのためのダミー.
 *
 * @author Hexirp
 */
public class ItemMock extends Item {
	/** 名前を表す. */
	private final String name;
	
	/**
	 * コントストラクタ.
	 *
	 * @param s 名前
	 */
	public ItemMock(final String s) {
		this.name = s;
	}
	
	@Override
	public boolean equals(@Nullable final Object o) {
		return (o != null && o instanceof ItemMock) ? name == ((ItemMock) o).name : false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
