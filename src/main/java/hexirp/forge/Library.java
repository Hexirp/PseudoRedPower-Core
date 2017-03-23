package hexirp.forge;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import hexirp.annotation.Chaining;
import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.OneField;

/**
 * MODにおいて追加される要素を保持する辞書を表現する.
 *
 * 何かを追加するクラスを抽象化したクラス群の共通部分を取り出すことにより作成された。
 *
 * @author Hexirp
 * @param <Element> 要素の型
 */
public class Library<Element> extends OneField<List<Element>> {
	/** Setting. */
	@Setting
	public Library() {
		super(new LinkedList<>());
	}
	
	/**
	 * 値を追加する.
	 *
	 * @param element 追加される要素
	 * @return this
	 * @see java.util.Collection#add(Object)
	 */
	@Chaining
	public Library<Element> add(final Element element) {
		value.add(element);
		return this;
	}
	
	/**
	 * 全ての要素に操作を適用する.
	 *
	 * @param action 一つの引数を取り、結果を返さない操作
	 * @see java.lang.Iterable#forEach(Consumer)
	 */
	@Command
	public void forEach(final Consumer<? super Element> action) {
		value.forEach(action);
	}
}
