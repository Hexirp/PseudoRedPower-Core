package hexirp.collection;

import java.util.HashMap;

import hexirp.annotation.Setting;

/**
 * {@link HashMap}を保持するクラスを表す.
 *
 * @author Hexirp
 * @param <K> キー
 * @param <V> 値
 */
public abstract class HashMapHolder<K, V> extends OneField<HashMap<K, V>> {
	/** Setting. */
	@Setting
	public HashMapHolder() {
		super(new HashMap<K, V>());
	}
}
