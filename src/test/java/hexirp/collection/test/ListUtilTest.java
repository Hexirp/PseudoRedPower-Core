package hexirp.collection.test;

import static hexirp.test.MethodTest.*;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import hexirp.collection.AbstractListUtil;
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
	
	/** 副作用がある. */
	@Test
	public void test_merge() {
		assertChaining(
		    new ListUtil<String>(),
		    (final AbstractListUtil<String> t) -> t.merge(new LinkedList<String>()));
	}
}
