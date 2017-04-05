package hexirp.forge.test;

import static hexirp.annotation.test.MethodLaw.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import hexirp.forge.Library;

/**
 * @author Hexirp
 */
public class LibraryTest {
	/** インスタンス生成機. */
	private static final Supplier<Library<String>> init = Library::new;
	
	/** {@link Library#Library()}をテストする. */
	@Test
	public final void testLibrary() {
		assertSetting(init);
	}
	
	/** {@link Library#add(Object)}をテストする. */
	@Test
	public final void testAdd() {
		assertChaining(init.get(), t -> t.add(""));
		assertNotEquals(init.get().add("A").add("B"), init.get().add("B").add("A"));
	}
	
	/** {@link Library#forEach(java.util.function.Consumer)}をテストする. */
	@Test
	public final void testForEach() {
		final Library<String> testee = init.get().add("").add("").add("AA").add("BB");
		final StringBuilder buf = new StringBuilder();
		testee.forEach(buf::append);
		assertEquals(buf.toString(), "AABB");
	}
}
