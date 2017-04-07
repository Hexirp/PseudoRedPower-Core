package hexirp.forge.test;

import org.junit.Test;

import hexirp.forge.LoadableLibrary;

/**
 * {@link LoadableLibrary}のテストを表す.
 *
 * @author Hexirp
 */
public class LoadableLibraryTest {
	/** {@link LoadableLibrary#load(hexirp.forge.loadable.Environment)}をテストする. */
	@Test
	public final void testLoad() {
		// TODO: 限界
		//		final LoadingLog log = new LoadingLog();
		//		final LoadableLibrary testee = new LoadableLibrary()
		//		    .add(new LoadableMock(log, new ItemMock("A")))
		//		    .add(new LoadableMock(log, new ItemMock("B")))
		//		    .add(new LoadableMock(log, new ItemMock("C")));
		//		final Index<MinecraftItem> index = testee.load(new EnvironmentMock());
		//		assertEquals(log, new LoadingLog()
		//		    .add(new ItemMock("A"))
		//		    .add(new ItemMock("B"))
		//		    .add(new ItemMock("C")));
		//		assertEquals(index, new Index<MinecraftItem>().put("A", new MinecraftItemMock("A")).put("B", new MinecraftItemMock("B")).put("B", new MinecraftItemMock("B")));
	}
}
