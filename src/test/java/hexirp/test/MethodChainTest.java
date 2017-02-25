package hexirp.test;

import static org.junit.Assert.*;

import java.util.function.Function;

/**
 * メソッドチェーンに関するテストの為の関数を記述する.
 *
 * @author Hexirp
 */
public class MethodChainTest {
	/**
	 * メソッドチェーンに副作用がある.
	 *
	 * @param data データ
	 * @param method メソッドチェーン
	 * @param <A> 任意のクラス
	 */
	public static <A> void assertSideEffect(final A data, final Function<A, A> method) {
		final A new_data = method.apply(data);
		
		assertEquals(data, new_data);
	}
}