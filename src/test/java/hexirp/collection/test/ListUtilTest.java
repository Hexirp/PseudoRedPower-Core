package hexirp.collection.test;

import static hexirp.test.MethodChainTest.*;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import hexirp.collection.ListUtil;

/**
 * {@link ListUtil}のテストを記述する.
 *
 * @author Hexirp
 */
public class ListUtilTest {
	/** 正常に変換される. */
	@SuppressWarnings("deprecation")
	@Test
	public void test_array() {
		assertEquals(
		    new ListUtil<String>().array(),
		    new String[] {});
	}

	/** 正常に例外を投げる. */
	//@Test(expected = NullPointerException.class)
	public void test_array_null() {
		new ListUtil<Object>();
	}

	/** 副作用がある. */
	@Test
	public void test_merge() {
		assertSideEffect(
		    new ListUtil<String>(),
		    (final ListUtil<String> t) -> t.merge(new LinkedList<String>()));
	}
}
