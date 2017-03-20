package hexirp.forge.loadable;

import hexirp.annotation.Getting;
import hexirp.forge.Loadable;
import net.minecraft.block.Block;

/**
 * {@link Block}のメソッドを拡張するためのインターフェースを表す. このインターフェースは{@link Block}を継承したクラスで実装されなければならない。
 *
 * @author Hexirp
 */
public interface ExtendedBlock extends Named {
	/**
	 * 自分型アノテーションに似た物.
	 *
	 * @return this
	 */
	// TODO: アノテーションは何が相応しい？
	public default Block self() {
		return (Block) this;
	}
	
	/**
	 * @return {@link Loadable}を実装したブロック
	 */
	@Getting
	public default Loadable loader() {
		return new LoadableBlock(self(), name());
	}
	
	/**
	 * 名前を設定する.
	 *
	 * @return this
	 */
	public default Block setName() {
		self().setUnlocalizedName(name());
		self().setRegistryName(name());
		return self();
	}
}
