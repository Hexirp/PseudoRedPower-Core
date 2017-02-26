package hexirp.forge.recipe.builder;

import java.util.function.Function;

/**
 * ラムダ式によるBuilderでの分岐を表現する.
 *
 * @author Hexirp
 * @param <A> 第一分岐の引数
 * @param <B> 第一分岐の返り値
 * @param <C> 第二分岐の引数
 * @param <D> 第二分岐の返り値
 */
public class Branch<A, B, C, D> {
	/** 第一分岐. */
	private final Function<A, B> t;
	
	/** 第二分岐. */
	private final Function<C, D> s;
	
	/**
	 * Setter.
	 * 
	 * @param t 第一分岐
	 * @param s 第二分岐
	 */
	public Branch(final Function<A, B> t, final Function<C, D> s) {
		this.t = t;
		this.s = s;
	}
	
	/**
	 * 第一分岐に進む.
	 * 
	 * @param a 引数
	 * @return 返り値
	 */
	public B apply1(final A a) {
		return t.apply(a);
	}
	
	/**
	 * 第二分岐に進む.
	 * 
	 * @param c 引数
	 * @return 返り値
	 */
	public D apply2(final C c) {
		return s.apply(c);
	}
}
