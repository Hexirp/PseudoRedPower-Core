package com.github.hexirp.annotation;

/**
 * {@link NonNullByDefault}において、{@link NonNull}が付けられていると見なされる要素を指定するための列挙型.
 *
 * @author Hexirp
 */
public enum DefaultLocation {
    /** 引数. */
	PARAMETER,
	
	/** 返り値. */
	RETURN_TYPE,
	
	/** フィールド. */
	FIELD,
	
	/** 型引数. */
	TYPE_PARAMETER,
	
	/** 型制限. */
	TYPE_BOUND,
	
	/** 型変数. */
	TYPE_ARGUMENT,
	
	/** 配列の要素. */
	ARRAY_CONTENTS;
}
