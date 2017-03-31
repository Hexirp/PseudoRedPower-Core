package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;

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
	}
	
	/** {@link OneField#equals(Object)}をテストする. */
	@Test
	public void testEqualsObject() {
		assertGetting(init.get(), t -> t.equals(null));
	}
	
}
