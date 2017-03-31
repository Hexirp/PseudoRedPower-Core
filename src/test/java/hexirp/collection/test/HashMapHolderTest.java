package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;

import org.junit.Test;

import hexirp.collection.HashMapHolder;

/**
 * {@link HashMapHolder}をテストする.
 *
 * @author Hexirp
 */
public class HashMapHolderTest {
	/** {@link HashMapHolder#HashMapHolder()}をテストする. */
	@Test
	public void testHashMapHolder() {
		assertSetting(() -> new HashMapHolder<Object, Object>() {});
	}
}
