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
	public static <A> void method_chain_with_side_effects(final A data, final Function<A, A> method) {
		final A data2 = method.apply(data);
		
		assertEquals(data, data2);
	}
}