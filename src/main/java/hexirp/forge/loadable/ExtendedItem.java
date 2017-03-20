package hexirp.forge.loadable;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.forge.Loadable;
import net.minecraft.item.Item;

/**
 * 拡張されたアイテムを表す. このインターフェースは{@link Item}を継承したクラスで実装されなければならない。
 *
 * @author Hexirp
 */
public interface ExtendedItem extends Named {
	/**
	 * 自分型アノテーションに似た物.
	 *
	 * @return this
	 */
	// TODO: アノテーションは何が相応しい？
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
	 * 名前をセットする.
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
