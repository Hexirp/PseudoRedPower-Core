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
		assertSetting(() -> new MinecraftItemMock(""));
	}
	
	/** {@link MinecraftItem#MinecraftItem(net.minecraft.block.Block)}をテストする. */
	@Test
	public final void testMinecraftItemBlock() {
		fail("まだ実装されていません");
	}
	
	/** {@link MinecraftItem#item()}をテストする. */
	@Test
	public final void testItem() {
		fail("まだ実装されていません");
	}
	
}
