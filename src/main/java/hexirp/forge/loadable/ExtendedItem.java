package hexirp.forge.loadable;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.forge.Loadable;
import net.minecraft.item.Item;

/**
 * {@link Item}のメソッドを拡張するためのインターフェースを表す. このインターフェースは{@link Item}を継承したクラスで実装されなければならない。
 *
 * @author Hexirp
 */
public interface ExtendedItem extends Named {
	/**
	 * 自分型アノテーションに似た物.
	 *
	 * @return this
	 */
	@Getting
	public default Item self() {
		return (Item) this;
	}

	/**
	 * @return {@link Loadable}を実装したアイテム
	 */
	@Getting
	public default Loadable loader() {
		return new LoadableItem(self(), name());
	}

	/**
	 * 名前を設定する.
	 *
	 * @return this
	 */
	@Chaining
	public default Item setName() {
		self().setUnlocalizedName(name());
		self().setRegistryName(name());
		return self();
	}
}
