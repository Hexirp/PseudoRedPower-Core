package hexirp.test;

import static org.junit.Assert.*;

import java.util.function.Function;
import java.util.function.Supplier;

import hexirp.annotation.Method.Chaining;
import hexirp.annotation.Method.Setting;

/**
 * メソッドをテストする為の関数を記述する.
 *
 * @author Hexirp
 */
public class MethodTest {
	/**
	 * メソッドが{@link Setting}を満たす.
	 *
	 * <p>
	 * 使用例: {@code assertSetter(() -> new Foo(2, 3)}
	 * </p>
	 *
	 * @param constructor コントストラクタを表現するラムダ式
	 */
	public static <A> void assertSetting(final Supplier<A> constructor) {
		assertEquals(constructor.get(), constructor.get());
	}
	
	/**
	 * メソッドが{@link Chaining}を満たす.
	 *
	 * <p>
	 * 使用例: {@code assertChaining(new Foo(), t -> t.baa());}
	 * </p>
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
