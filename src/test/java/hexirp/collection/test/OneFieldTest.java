package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;
import static hexirp.test.AssertException.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.collection.OneField;

/**
 * {@link OneField}をテストする.
 *
 * @author Hexirp
 */
public class OneFieldTest {
	/** インスタンス生成機. */
	private static final Supplier<OneField<String>> init = () -> new OneField<String>("wqa") {};
	
	/** {@link OneField#hashCode()}をテストする. */
	@Test
	public void testHashCode() {
		assertGetting(init.get(), t -> t.hashCode());
	}
	
	/** {@link OneField#OneField(Object)}をテストする. */
	@Test
	public void testOneField() {
		assertSetting(init);
		assertException(() -> new OneField<Object>(null) {}, NullPointerException.class);
	}
	
	/** {@link OneField#equals(Object)}をテストする. */
	@Test
	public void testEqualsObject() {
		assertGetting(init.get(), t -> t.equals(null));
		assertTrue(init.get().equals(init.get()));
		assertFalse(init.get().equals(new Object()));
	}
}
