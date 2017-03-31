package hexirp.collection.test;

import static hexirp.annotation.test.MethodTest.*;
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
	@Test
	public void test_array() {
		assertArrayEquals(
		    new ListUtil<String>().array(),
		    new String[] {});
	}
	
	/** {@link NullPointerException}を投げる. */
	@Test(expected = NullPointerException.class)
	public void test_array_null() {
		/** Mixin */
		class ErrorListUtil extends AbstractListUtil<Object> implements UsingErrorList<Object> {}
		
		new ErrorListUtil().array();
	}
	
	/** 副作用がある. */
	@Test
	public void test_merge() {
		assertChaining(
		    new ListUtil<String>(),
		    (final AbstractListUtil<String> t) -> t.merge(new LinkedList<String>()));
	}
}
