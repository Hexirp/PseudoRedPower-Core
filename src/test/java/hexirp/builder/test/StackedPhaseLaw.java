package hexirp.builder.test;

import static org.junit.Assert.*;

import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;

/**
 * {@link StackedPhase}の法則を表現する.
 *
 * @author Hexirp
 */
public class StackedPhaseLaw {
	/**
	 * 前後の法則.
	 *
	 * @param phase 試験対象
	 * @param <Product> 生産物
	 * @param <Previous> 前段階
	 */
	public static <Product extends StackedPhase<Previous>, Previous extends SimpleTransitional<Product>> void law(
	    final StackedPhase<Previous> phase) {
		assertEquals(phase, phase.previous().to());
	}
}
