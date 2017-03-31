package hexirp.collection.test;

import static hexirp.annotation.test.MethodTest.*;

import org.junit.Test;

import hexirp.collection.Pair;

/**
 * {@link Pair}のテストを表す.
 *
 * @author Hexirp
 */
public class PairTest {
	/** {@link Pair#Pair(Object, Object)}をテストする. */
	@Test
	public void testPair() {
		assertSetting(() -> new Pair<Integer, String>(3, "aaa"));
	}
}
