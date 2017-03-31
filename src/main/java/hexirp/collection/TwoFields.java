package hexirp.collection;

import java.util.Objects;

import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;

/**
 * 二つしかフィールドを持たないことを表す.
 *
 * @author Hexirp
 * @param <T1> 型1
 * @param <T2> 型2
 */
public abstract class TwoFields<T1, T2> {
	/** 値1. */
	protected final T1 first;
	
	/** 値2. */
	protected final T2 second;
	
	/**
	 * @param first {@link #first}
	 * @param second {@link #second}
	 */
	@Setting
	public TwoFields(final @Nullable T1 first, final @Nullable T2 second) {
		if (null == first || null == second) throw null;
		this.first = first;
		this.second = second;
	}
	
	@Override
	@Getting
	public boolean equals(final @Nullable Object obj) {
		if (null == obj) return false;
		return eq(obj);
	}
	
	/**
	 * @param obj nullではないオブジェクト
	 * @return 同値であるか
	 */
	@Getting
	public boolean eq(final Object obj) {
		if (this.getClass() != obj.getClass()) return false;
		final TwoFields<?, ?> that = (TwoFields<?, ?>) obj;
		return Objects.equals(this.first, that.first) && Objects.equals(this.second, that.second);
	}
	
	@Override
	@Getting
	public int hashCode() {
		return Objects.hash(first, second);
	}
}
