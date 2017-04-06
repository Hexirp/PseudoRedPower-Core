package hexirp.test;

import static org.junit.Assert.*;

/**
 * 例外に関する規約を表す.
 *
 * @author Hexirp
 */
public final class AssertException {
	/**
	 * @param runner 実行する処理
	 * @param exclass 投げられるべき例外
	 */
	public static final void assertException(final Runnable runner, final Class<? extends Exception> exclass) {
		try {
			runner.run();
			fail(exclass.toString() + " wasn't thrown");
		} catch (final Exception e) {
			assertTrue("Thrown " + e.toString() + " isn't " + exclass.toString(), exclass.isInstance(e));
		}
	}
	
	/**
	 * @param runner 実行する処理
	 * @param exclass 投げられるべき例外
	 * @param exmessage 例外のメッセージ
	 */
	public static final void assertException(final Runnable runner, final Class<? extends Exception> exclass, final String exmessage) {
		try {
			runner.run();
			fail(exclass.toString() + " wasn't thrown");
		} catch (final Exception e) {
			assertTrue("Thrown " + e.toString() + " isn't " + exclass.toString(), exclass.isInstance(e));
			assertEquals(e.getMessage(), exmessage);
		}
	}
}
