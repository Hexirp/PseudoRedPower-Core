package hexirp.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;
import hexirp.collection.Unit;

/**
 * @author Hexirp
 *
 * @param <T1> 受け継いだ値
 * @param <T2> この段階が必要とする値
 * @param <T3> 生成物
 */
public abstract class FinalPhase<T1, T2, T3> extends Phase<T1, T2, T3, Unit> {
	/**
	 * @param stack これまでの値の記録
	 * @param value この段階で保存する値
	 */
	@Setting
	public FinalPhase(final T1 stack, final T2 value) {
		super(stack, value);
	}

	@Override
	@Getting
	public final T3 to(final Unit value) {
		return to();
	}

	/**
	 * @return 生成物
	 */
	@Getting
	public abstract T3 to();
}
