package hexirp.collection;

import hexirp.annotation.Getting;

/**
 * ペア型を表す.
 *
 * @author Hexirp
 *
 * @param <T1> 第一要素
 * @param <T2> 第二要素
 */
public final class Pair<T1, T2> extends TwoFields<T1, T2> {
	/**
	 * @param first 第一値
	 * @param second 第二値
	 */
	public Pair(final T1 first, final T2 second) {
		super(first, second);
	}
	
	/**
	 * @return {@link #first}
	 */
	@Override
	@Getting
	public final T1 first() {
		return first;
	}
	
	/**
	 * @return {@link #second}
	 */
	@Override
	@Getting
	public final T2 second() {
		return second;
	}
}
