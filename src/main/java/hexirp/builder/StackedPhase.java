package hexirp.builder;

import hexirp.annotation.Method.Getting;
import hexirp.annotation.Method.Setting;

/**
 * 前段階の情報を使用する段階を表現する. 前段階の上に積み重ねられた段階である。
 *
 * @author Hexirp
 * @param <Previous> 前段階の型
 */
public class StackedPhase<Previous> {
	/** 前段階. */
	private final Previous previous;

	/**
	 * 前段階を取得する.
	 *
	 * @return {@link #previous}
	 */
	@Getting
	public final Previous previous() {
		return previous;
	}

	/**
	 * @param previous {@link #previous}
	 */
	@Setting
	public StackedPhase(final Previous previous) {
		this.previous = previous;
	}
}
