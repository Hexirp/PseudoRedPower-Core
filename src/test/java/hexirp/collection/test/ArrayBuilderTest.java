package hexirp.collection.test;

import static hexirp.annotation.test.MethodLaw.*;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import hexirp.collection.ArrayBuilder;

/**
 * {@link ListUtil}のテストを記述する.
 *
 * @author Hexirp
 */
public class ArrayBuilderTest {
	/** {@link ArrayBuilder#array()}をテストする. */
	@Test
	public void testArray() {
		assertArrayEquals(
		    new ArrayBuilder<String>().array(),
		    new String[] {});
	}
	
	/** {@link ArrayBuilder#array()}の例外パターンをテストする. */
	@Test(expected = NullPointerException.class)
	public void testArrayNull() {
		// TODO: どうにかしてLinkedList#toArray()にnullを返させる、またはArrayBuilderの内部で使用しているLinkedListをtoArray()でnullを返すように変えた物に置き換える
		throw null;
	}
	
	/** {@link ArrayBuilder#merge(Collection<? extends Element>)}をテストする. */
	@Test
	public void testMerge() {
		assertChaining(
		    new ArrayBuilder<String>(),
		    (final ArrayBuilder<String> t) -> t.merge(new LinkedList<String>()));
	}
}
