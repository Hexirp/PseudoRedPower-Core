package hexirp.forge.loadable.block;

import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.block.Block;

/**
 * 名前付きブロックを表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きブロック
 */
public class NamedBlock<Type extends Block & Named> extends NamedType<Type> {
	/**
	 * Setter.
	 *
	 * @param value {@link NamedType}
	 */
	public NamedBlock(final Type value) {
		super(value);
	}
}