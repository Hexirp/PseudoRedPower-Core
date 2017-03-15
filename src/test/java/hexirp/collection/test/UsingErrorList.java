package hexirp.collection.test;

import java.util.LinkedList;
import java.util.List;

import hexirp.collection.UsingList;

/**
 * {@link List#toArray()}がnullとなるリストを使用する事を表現する.
 *
 * @author Hexirp
 * @param <E> 要素
 */
public interface UsingErrorList<E> extends UsingList<E> {
	@Override
	default public List<E> usedList() {
		return new LinkedList<E>() {
			/** シリアルID. */
			private static final long serialVersionUID = 1L;
			
			@SuppressWarnings("null")
			@Override
			public Object[] toArray() {
				return null;
			}
		};
	}
}
