package hexirp.collection;

import java.util.List;

/**
 * {@link List}を使用する事を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public interface UsingList<Element> {
	/**
	 * @return 使用するリスト
	 */
	public List<Element> usedList();
}
