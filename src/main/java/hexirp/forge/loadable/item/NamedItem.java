package hexirp.forge.loadable.item;

import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.item.Item;

/**
 * 名前付きアイテムを表現する.
 *
 * @author Hexirp
 * @param <Type> 保存する型
 */
public class NamedItem<Type extends Item & Named> extends NamedType<Type> {
	/**
	 * Setter.
	 *
	 * @param value {@link NamedType}
	 */
	public NamedItem(final Type value) {
		super(value);
	}
}