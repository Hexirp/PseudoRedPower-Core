package com.github.hexirp.builder.test;

import static org.junit.Assert.*;

import com.github.hexirp.builder.SimpleTransitional;
import com.github.hexirp.builder.StackedPhase;

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
	 */
	public static <Product extends StackedPhase<Previous>, Previous extends SimpleTransitional<Product>>
	    void law(StackedPhase<Previous> phase) {
		assertEquals(phase, phase.previous().to());
	}
}