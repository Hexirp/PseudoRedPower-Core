package hexirp.forge.loadable.item;

import hexirp.Named;
import hexirp.forge.Registerable;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 名前付きアイテムを表現する.
 *
 * @author Hexirp
 * @param <Type> 保存する型
 */
public class NamedItem<Type extends Item & Named> implements Registerable {
	/** 保存する値. */
	private final Type t;
	
	/**
	 * Setter.
	 *
	 * @param t {@link #t}
	 */
	public NamedItem(final Type t) {
		this.t = t;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #t}
	 */
	public Type get() {
		return t;
	}
	
	@Override
	public void register() {
		GameRegistry.registerItem(t, t.name());
	}
}