package hexirp.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Setting;

// TODO: 本来は「不定数の値を集める」という性質は「次の段階に進むのに情報を必要としない」という性質と直交するはずだが...
// 多重継承が出来ないため、InfolessPhaseを継承してしまっている。
/**
 * 不定数の数を集める段階を表現する.
 *
 * @author Hexirp
 *
 * @param <T1> 受け継いだ値
 * @param <T2> この段階が必要とする値
 * @param <T3> 生成物
 * @param <E> 集める要素
 */
public abstract class ListingPhase<T1, T2, T3, E> extends InfolessPhase<T1, T2, T3> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public ListingPhase(final T1 stack, final T2 value) {
		super(stack, value);
	}
	
	/**
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public abstract ListingPhase<T1, T2, T3, E> set(E element);
}
