package hexirp.collection;

import java.util.LinkedList;

/**
 * {@link LinkedList}を保持するクラスを表す.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public abstract class LinkedListUser<Element> extends OneField<LinkedList<Element>> {
	/** Setting. */
	@Setting
	public LinkedListUser() {
		super(new LinkedList<Element>());
	}
}