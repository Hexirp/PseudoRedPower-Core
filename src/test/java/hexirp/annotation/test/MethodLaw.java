package hexirp.annotation.test;

import static org.junit.Assert.*;

import java.util.function.Function;
import java.util.function.Supplier;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

/**
 * メソッドがアノテーションの制約を満たすかテストする為の関数を記述する.
 *
 * @author Hexirp
 */
public class MethodLaw {
	/**
	 * メソッドが{@link Setting}を満たす.
	 *
	 * <p>
	 * 使用例: {@code assertSetter(() -> new Foo(2, 3)}
	 * </p>
	 *
	 * @param constructor コントストラクタを表現するラムダ式
	 * @param <A> テストするクラス
	 */
	public static <A> void assertSetting(final Supplier<A> constructor) {
		assertEquals(constructor.get(), constructor.get());
	}

	/**
	 * メソッドが{@link Getting}を満たす.
	 *
	 * <p>
	 * 使用例: {@code assertGetting(new Foo(), t -> t.baa()}
	 * </p>
	 *
	 * @param data データ
	 * @param method メソッドを表すラムダ式
	 * @param <A> テストするクラス
	 * @param <B> 取り出す情報
	 */
	public static <A, B> void assertGetting(final A data, final Function<A, B> method) {
		final B value1 = method.apply(data);
		final B value2 = method.apply(data);

		assertEquals(value1, value2);
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
	 * @param <A> テストするクラス
	 */
	public static <A> void assertChaining(final A data, final Function<A, A> method) {
		final A new_data = method.apply(data);

		assertTrue(data == new_data);
	}
}
