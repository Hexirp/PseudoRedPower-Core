package hexirp.collection.test;

import static hexirp.annotation.test.MethodTest.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.collection.GettableTwoFields;

/**
 * {@link GettableTwoFields}のテストを表す.
 *
 * @author Hexirp
 */
public class GettableTwoFieldsTest {
	/** インスタンスの生産者. */
	private static final Supplier<GettableTwoFields<Integer, String>> init = () -> new GettableTwoFields<Integer, String>(3, "aaa") {};
	
	/** {@link GettableTwoFields#GettableTwoFields(Object, Object)}をテストする. */
	@Test
	public void testGettableTwoFields() {
		assertSetting(init);
	}
	
	/** {@link GettableTwoFields#first()}をテストする. */
	@Test
	public void testFirst() {
		assertGetting(init.get(), t -> t.first());
		
		assertEquals((int) init.get().first(), 3);
	}
	
	/** {@link GettableTwoFields#second()}をテストする. */
	@Test
	public void testSecond() {
		assertGetting(init.get(), t -> t.second());
		
		assertEquals(init.get().second(), "aaa");
	}
	
}
