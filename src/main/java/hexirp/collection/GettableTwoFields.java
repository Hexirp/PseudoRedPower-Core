package hexirp.collection;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

/**
 * 取得可能な二つのフィールドを持つ型を表す.
 *
 * @author Hexirp
 *
 * @param <T1> 型1
 * @param <T2> 型2
 */
public class GettableTwoFields<T1, T2> extends TwoFields<T1, T2> {
	/**
	 * @param first {@link #first}
	 * @param second {@link #second}
	 */
	@Setting
	public GettableTwoFields(final T1 first, final T2 second) {
		super(first, second);
	}
	
	/**
	 * @return {@link #first}
	 */
	@Getting
	public final T1 first() {
		return first;
	}
	
	/**
	 * @return {@link #second}
	 */
	@Getting
	public final T2 second() {
		return second;
	}
	
}
