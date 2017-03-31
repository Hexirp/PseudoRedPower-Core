package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;

import org.junit.Test;

import hexirp.collection.Unit;

/**
 * {@link Unit}のテストを表現する.
 *
 * @author Hexirp
 */
public class UnitTest {
	/** {@link Unit#$()}をテストする. */
	@Test
	public void test$() {
		assertSetting(Unit::$);
	}
}
