package hexirp.builder;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

/**
 * 進む先が二つに分岐している段階を表す.
 *
 * @author Hexirp
 * @param <T1> これまでの段階で保存された値の記録
 * @param <T2> この段階で保存する値
 * @param <T3> 次の段階
 * @param <T4> 次の段階が必要とする値
 * @param <T5> 次の段階
 * @param <T6> 次の段階が必要とする値
 */
public abstract class BranchedPhase<T1, T2, T3, T4, T5, T6> extends Phase<T1, T2, T3, T4> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public BranchedPhase(final T1 stack, final T2 value) {
		super(stack, value);
	}

	/**
	 * @param value 次の段階が必要とする値
	 * @return 次の段階
	 */
	@Getting
	public abstract T5 to2(T6 value);
}
