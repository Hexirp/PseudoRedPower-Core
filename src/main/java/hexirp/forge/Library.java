package hexirp.forge;

import java.util.function.Consumer;

import hexirp.annotation.Chaining;
import hexirp.annotation.Command;
import hexirp.collection.LinkedListUser;

/**
 * MODにおいて追加される要素を保持する辞書を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素の型
 */
public class Library<Element> extends LinkedListUser<Element> {
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
