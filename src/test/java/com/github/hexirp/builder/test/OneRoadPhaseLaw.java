package com.github.hexirp.builder.test;

import static org.junit.Assert.*;

import com.github.hexirp.builder.OneRoadPhase;
import com.github.hexirp.builder.StackedPhase;

/**
 * {@link OneRoadPhase}の法則を表現する.
 *
 * @author Hexirp
 */
public class OneRoadPhaseLaw {
	/**
	 * 前後の法則.
	 *
	 * @param phase 試験対象
	 */
	public static <Product extends StackedPhase<Previous>, Previous extends OneRoadPhase<Product>>
	    void law(OneRoadPhase<Product> phase) {
		assertEquals(phase, phase.to().previous());
	}
}
