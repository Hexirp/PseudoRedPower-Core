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
public abstract class TwoFields<@Nullable T1, @Nullable T2> extends PoorTwoFields<T1, T2> {
	/**
	 * @param first {@link #first}
	 * @param second {@link #second}
	 */
	@Setting
	public TwoFields(final T1 first, final T2 second) {
		super(first, second);
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
		final TwoFields<@Nullable ?, @Nullable ?> that = (TwoFields<@Nullable ?, @Nullable ?>) obj;
		return Objects.equals(this.first, that.first) && Objects.equals(this.second, that.second);
	}
	
	@Override
	@Getting
	public int hashCode() {
		return Objects.hash(first, second);
	}
}
