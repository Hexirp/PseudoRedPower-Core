package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.collection.TwoFields;

/**
 * {@link TwoFields}のテストを表す.
 *
 * @author Hexirp
 */
public class TwoFieldsTest {
	/** インスタンス作成者. */
	private final static Supplier<TwoFields<Float, String>> init = () -> new TwoFields<Float, String>(0.34f, "wsx") {};
	
	/** {@link TwoFields#hashCode()}をテストする. */
	@Test
	public void testHashCode() {
		assertGetting(init.get(), t -> t.hashCode());
		assertEquals(init.get().hashCode(), init.get().hashCode());
	}
	
	/** {@link TwoFields#TwoFields(Object, Object)}をテストする. */
	@Test
	public void testTwoFields() {
		assertSetting(init);
	}
	
	/** {@link TwoFields#equals(Object)}をテストする. */
	@Test
	public void testEqualsObject() {
		assertGetting(init.get(), t -> t.equals(null));
		assertTrue(init.get().equals(init.get()));
	}
	
	/** {@link TwoFields#eq(Object)}をテストする. */
	@Test
	public void testEq() {
		assertGetting(init.get(), t -> t.eq(init));
	}
}
