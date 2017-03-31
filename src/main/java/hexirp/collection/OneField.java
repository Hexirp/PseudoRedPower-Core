package hexirp.collection;

import java.util.Objects;

import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;

/**
 * 一つしかフィールドを持たないことを表す.
 *
 * @author Hexirp
 *
 * @param <T> 型
 */
public abstract class OneField<T> {
	/** 値. */
	protected final T value;
	
	/**
	 * @param value 値
	 */
	@Setting
	public OneField(final @Nullable T value) {
		if (null == value) throw null;
		this.value = value;
	}
	
	@Override
	@Getting
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		final OneField<?> that = (OneField<?>) obj;
		return Objects.equals(this.value, that.value);
	}
	
	@Override
	@Getting
	public int hashCode() {
		return Objects.hash(value);
	}
}
