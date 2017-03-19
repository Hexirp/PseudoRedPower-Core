package hexirp.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;

/**
 * ビルダーを表現する.
 *
 * @author Hexirp
 * @param <T1> これまでの段階で保存された値の記録
 * @param <T2> この段階で保存する値
 * @param <T3> 次の段階
 * @param <T4> 次の段階が必要とする値
 */
public abstract class Phase<T1, T2, T3, T4> extends TwoFields<T1, T2> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public Phase(final T1 stack, final T2 value) {
		super(stack, value);
	}
	
	/**
	 * @param value 必要な値
	 * @return 変換された値
	 */
	@Getting
	abstract public T3 to(T4 value);
}
