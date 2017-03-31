package hexirp.collection.test;

import static hexirp.annotation.test.MethodTest.*;
import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.collection.GettableTwoFields;

/**
 * {@link GettableTwoFields}のテストを表す.
 *
 * @author Hexirp
 */
public class GettableTwoFieldsTest {
	/** {@link GettableTwoFields#GettableTwoFields(Object, Object)}をテストする. */
	@Test
	public void testGettableTwoFields() {
		assertSetting(() -> new GettableTwoFields<Integer, String>(3, "aaa") {});
	}
	
	/** {@link GettableTwoFields#first()}をテストする. */
	@Test
	public void testFirst() {
		fail("まだ実装されていません");
	}
	
	/** {@link GettableTwoFields#second()}をテストする. */
	@Test
	public void testSecond() {
		fail("まだ実装されていません");
	}
	
}
