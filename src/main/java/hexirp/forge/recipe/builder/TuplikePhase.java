package hexirp.forge.recipe.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;

/**
 * Tupleで表現できる値を組み立てる物を表現する.
 *
 * @author Hexirp
 * @param <T1> これまでの段階で保存された値の記録
 * @param <T2> この段階で保存する値
 * @param <T3> 次の段階
 * @param <T4> 次の段階で保存される値
 */
public abstract class TuplikePhase<T1, T2, T3, T4> {
	/** 段階の記録. */
	protected final T1 stack;
	
	/** 保存する値. */
	protected final T2 value;
	
	/**
	 * @param stack {@link #stack}
	 * @param value {@link #value}
	 */
	@Setting
	public TuplikePhase(final T1 stack, final T2 value) {
		this.stack = stack;
		this.value = value;
	}
	
	/**
	 * @param value 必要な値
	 * @return 変換された値
	 */
	@Getting
	abstract public T3 to(T4 value);
}
