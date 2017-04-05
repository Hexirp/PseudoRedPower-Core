package hexirp.forge.test;

import java.util.Objects;

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
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		if (this.getClass() != obj.getClass()) return false;
		final ItemMock that = (ItemMock) obj;
		return Objects.equals(this.name, that.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
