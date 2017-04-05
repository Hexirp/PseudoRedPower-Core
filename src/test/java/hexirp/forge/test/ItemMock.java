package hexirp.forge.test;

import java.util.Objects;

import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;
import net.minecraft.item.Item;

/**
 * テストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class ItemMock extends Item {
	/** 名前を表す. */
	private final String name;
	
	/**
	 * @param s 名前
	 */
	@Setting
	public ItemMock(final String s) {
		this.name = s;
	}
	
	@Override
	@Getting
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		if (this.getClass() != obj.getClass()) return false;
		final ItemMock that = (ItemMock) obj;
		return Objects.equals(this.name, that.name);
	}
	
	@Override
	@Getting
	public int hashCode() {
		return name.hashCode();
	}
}
