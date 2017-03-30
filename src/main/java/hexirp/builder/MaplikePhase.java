package hexirp.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Setting;
import hexirp.collection.Pair;

/**
 * 不定数の対応関係を集める段階を表現する.
 *
 * @author Hexirp
 *
 * @param <T1> 受け継いだ値
 * @param <T2> この段階が必要とする値
 * @param <T3> 生成物
 * @param <K> キー
 * @param <V> 値
 */
public abstract class MaplikePhase<T1, T2, T3, K, V> extends ListingPhase<T1, T2, T3, Pair<K, V>> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public MaplikePhase(final T1 stack, final T2 value) {
		super(stack, value);
	}
	
	@Override
	@Chaining
	public MaplikePhase<T1, T2, T3, K, V> set(final Pair<K, V> element) {
		this.set(element.first(), element.second());
		return this;
	}
	
	/**
	 * @param key キー
	 * @param value 値
	 * @return this
	 */
	@Chaining
	public abstract MaplikePhase<T1, T2, T3, K, V> set(final K key, final V value);
}
