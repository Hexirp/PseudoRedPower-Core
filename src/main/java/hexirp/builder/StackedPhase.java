package hexirp.builder;

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
	public Previous previous() {
		return previous;
	}
	
	/**
	 * Setter.
	 *
	 * @param previous {@link #previous}
	 */
	public StackedPhase(Previous previous) {
		this.previous = previous;
	}
}