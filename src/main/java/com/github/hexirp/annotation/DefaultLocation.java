package com.github.hexirp.annotation;

/**
 * NonNullByDefaultにおいて、NonNullが付けられていると見なされる範囲を指定するための列挙型.
 *
 * @author Hexirp
 */
public enum DefaultLocation {
	PARAMETER,
	RETURN_TYPE,
	FIELD,
	TYPE_PARAMETER,
	TYPE_BOUND,
	TYPE_ARGUMENT,
	ARRAY_CONTENTS
}
