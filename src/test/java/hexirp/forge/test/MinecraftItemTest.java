package hexirp.forge.test;

import static hexirp.annotation.test.MethodLaw.*;
import static org.junit.Assert.*;

import org.junit.Test;

import hexirp.forge.MinecraftItem;

/**
 * {@link MinecraftItem}のテストを表す.
 *
 * @author Hexirp
 */
public class MinecraftItemTest {
	/** {@link MinecraftItem#MinecraftItem(net.minecraft.item.Item)}をテストする. */
	@Test
	public final void testMinecraftItemItem() {
		assertSetting(() -> new MinecraftItemMock(new ItemMock("")));
	}
	
	/** {@link MinecraftItem#MinecraftItem(net.minecraft.block.Block)}をテストする. */
	@Test
	public final void testMinecraftItemBlock() {
		assertSetting(() -> new MinecraftItemMock(new BlockMock("")));
	}
	
	/** {@link MinecraftItem#item()}をテストする. */
	@Test
	public final void testItem() {
		assertGetting(new MinecraftItemMock(new ItemMock("A")), t -> t.item());
		assertEquals(new MinecraftItemMock(new ItemMock("A")).item(), new ItemMock("A"));
	}
}
