package hexirp.forge.test;

import static hexirp.annotation.test.MethodLaw.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.forge.Index;

/**
 * {@link Index}のテストを表現する.
 *
 * @author Hexirp
 */
public class IndexTest {
	/** インスタンス生成機. */
	private static final Supplier<Index<String>> init = Index::new;

	/** {@link Index#merge(Index)}をテストする. */
	@Test
	public final void testMerge() {
		assertChaining(init.get(), t -> t.merge(init.get()));
		assertEquals(init.get().put("A", "AAA").merge(init.get().put("B", "BBB")), init.get().put("A", "AAA").put("B", "BBB"));
	}

	/** {@link Index#put(String, Object)}をテストする. */
	@Test
	public final void testPut() {
		assertChaining(init.get(), t -> t.put("", ""));
		assertEquals(init.get().put("A", "1").lookup("A"), "1");
		assertEquals(init.get().put("A", "1").put("A", "2").lookup("A"), "2");
	}

	/** {@link Index#lookup(String)}をテストする. */
	@Test
	public final void testLookup() {
		assertGetting(init.get().put("A", "AAA"), t -> t.lookup("A"));

	}

	/** {@link Index#lookup(String)}の例外パターンをテストする. */
	@Test(expected = IllegalArgumentException.class)
	public final void testLookup_Exception() {
		init.get().lookup("");
	}
}
