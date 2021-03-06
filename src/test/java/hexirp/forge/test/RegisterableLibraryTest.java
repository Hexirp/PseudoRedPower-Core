package hexirp.forge.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.RegisterableLibrary;

/**
 * {@link RegisterableLibrary}のテストを表す.
 *
 * @author Hexirp
 */
public class RegisterableLibraryTest {
	/** {@link RegisterableLibrary#register()}をテストする. */
	@Test
	public final void testRegister() {
		final RegisteringLog log = new RegisteringLog();
		final RegisterableLibrary testee = new RegisterableLibrary()
		    .add(new RegisterableMock(log))
		    .add(new RegisterableMock(log))
		    .add(new RegisterableMock(log));
		testee.register();
		assertEquals(log, new RegisteringLog().inc().inc().inc());
	}
}
