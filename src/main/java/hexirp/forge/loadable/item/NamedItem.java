package hexirp.forge.loadable.item;

import hexirp.forge.loadable.Named;
import net.minecraft.item.Item;

/**
 * 名前付きアイテムを表現する.
 *
 * @author Hexirp
 * @param <Type> 保存する型
 */
public class NamedItem<Type extends Item & Named> {
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
}