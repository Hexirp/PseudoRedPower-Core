package hexirp.builder;

import hexirp.annotation.Method.Getting;

/**
 * 次の段階が一つしかない段階を表現する.
 *
 * @author Hexirp
 * @param <Next> 生成物の型
 */
public interface SimpleTransitional<Next> {
	/**
	 * @return 次の段階
	 */
	@Getting
	public Next to();
}
