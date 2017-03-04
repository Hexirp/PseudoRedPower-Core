package hexirp.builder;

/**
 * 次の段階が一つしかない段階を表現する.
 *
 * @author Hexirp
 * @param <Next> 生成物の型
 */
public interface SimpleTransitional<Next> {
	/**
	 * 次の段階に進む.
	 *
	 * @return 生成物
	 */
	@Getter
	public Next to();
}
