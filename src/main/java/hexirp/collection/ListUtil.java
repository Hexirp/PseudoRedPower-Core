package hexirp.collection;

import java.util.LinkedList;
import java.util.List;

import hexirp.annotation.Method.Getting;

/**
 * 配列への変換を表現する.
 *
 * @author Hexirp
 * @param <Element> 要素
 */
public class ListUtil<Element> extends AbstractListUtil<Element> {
	/**
	 * @return 使用するリスト
	 */
	@Override
	@Getting
	public List<Element> usedList() {
		return new LinkedList<>();
		
	}
}
