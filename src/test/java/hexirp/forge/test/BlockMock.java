package hexirp.forge.test;

import java.util.Objects;

import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;

/**
 * テストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class BlockMock {
	/** 比較用のID. */
	private final String id;
	
	/**
	 * @param id 比較用
	 */
	@Setting
	public BlockMock(final String id) {
		this.id = id;
	}
	
	@Override
	@Getting
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		if (this.getClass() != obj.getClass()) return false;
		final BlockMock that = (BlockMock) obj;
		return Objects.equals(this.id, that.id);
	}
	
	@Override
	@Getting
	public int hashCode() {
		return id.hashCode();
	}
	
	/**
	 * @return アイテムに変換されたブロック
	 */
	@Getting
	public ItemMock item() {
		return new ItemMock(id);
	}
}
