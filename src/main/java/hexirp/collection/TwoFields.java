package hexirp.collection;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

/**
 * 二つのフィールドを持つことを表す.
 *
 * @author Hexirp
 * @param <T1> 型1
 * @param <T2> 型2
 */
public class TwoFields<T1, T2> {
	/** 値1. */
	private final T1 first;
	
	/** 値2. */
	private final T2 second;
	
	/**
	 * @param first {@link #first}
	 * @param second {@link #second}
	 */
	@Setting
	public TwoFields(final T1 first, final T2 second) {
		this.first = first;
		this.second = second;
	}
	
	/**
	 * @return {@link #first}
	 */
	@Getting
	public T1 first() {
		return first;
	}
	
	/**
	 * @return {@link #second}
	 */
	@Getting
	public T2 second() {
		return second;
	}
}
