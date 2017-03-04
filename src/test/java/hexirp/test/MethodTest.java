package hexirp.test;

import static org.junit.Assert.*;

import java.util.function.Function;

/**
 * メソッドをテストする為の関数を記述する.
 *
 * @author Hexirp
 */
public class MethodTest {
	/**
	 * メソッドが自分自身を返す.
	 *
	 * @param data データ
	 * @param method メソッドを表すラムダ式
	 * @param <A> 任意のクラス
	 */
	public static <A> void assertChaining(final A data, final Function<A, A> method) {
		final A new_data = method.apply(data);
		
		assertTrue(data == new_data);
	}
}
