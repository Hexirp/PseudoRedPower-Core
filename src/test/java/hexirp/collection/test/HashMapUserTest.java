package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;

import org.junit.Test;

import hexirp.collection.HashMapUser;

/**
 * {@link HashMapHolder}をテストする.
 *
 * @author Hexirp
 */
public class HashMapUserTest {
	/** {@link HashMapHolder#HashMapHolder()}をテストする. */
	@Test
	public void testHashMapUser() {
		assertSetting(() -> new HashMapUser<Object, Object>() {});
	}
}
