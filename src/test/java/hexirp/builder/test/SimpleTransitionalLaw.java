package hexirp.builder.test;

import static org.junit.Assert.*;

import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;

/**
 * {@link SimpleTransitional}の法則を表現する.
 *
 * @author Hexirp
 */
public class SimpleTransitionalLaw {
	/**
	 * 前後の法則.
	 *
	 * @param phase 試験対象
	 * @param <Product> 生産物
	 * @param <Previous> 前段階
	 */
	public static <Product extends StackedPhase<Previous>, Previous extends SimpleTransitional<Product>> void law(
	    final SimpleTransitional<Product> phase) {
		assertEquals(phase, phase.to().previous());
	}
}
