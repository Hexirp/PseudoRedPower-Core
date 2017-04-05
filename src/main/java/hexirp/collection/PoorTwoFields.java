package hexirp.collection;

import hexirp.annotation.Nullable;
import hexirp.annotation.Setting;

/**
 * 機能を持たない{@link TwoFields}を表現する.
 *
 * @author Hexirp
 *
 * @param <T1> 型1
 * @param <T2> 型2
 */
public abstract class PoorTwoFields<T1, T2> {
	/** 値1. */
	protected final T1 first;
	
	/** 値2. */
	protected final T2 second;
	
	/**
	 * @param first {@link #first}
	 * @param second {@link #second}
	 */
	@Setting
	public PoorTwoFields(final @Nullable T1 first, final @Nullable T2 second) {
		if (null == first || null == second) throw null;
		this.first = first;
		this.second = second;
	}
}
