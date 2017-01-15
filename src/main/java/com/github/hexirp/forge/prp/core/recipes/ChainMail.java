package com.github.hexirp.forge.prp.core.recipes;

import com.github.hexirp.forge.RegisterableLibrary;

/**
 * チェーンメイルを作成するためのレシピを定義する.
 *
 * @author Hexirp
 */
public class ChainMail extends RegisterableLibrary {
	@Override
	protected void add() {
		library
		    .add(new UpperBody())
		    .add(new LowerBody());
	}
}
