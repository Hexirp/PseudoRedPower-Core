package hexirp.collection;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Method.Getting;

/**
 * {@link LinkedList}を使用する事を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public interface UsingLinkedList<Element> extends UsingList<Element> {
	@Override
	@Getting
	default public List<Element> usedList() {
		return new LinkedList<>();
	}
}
