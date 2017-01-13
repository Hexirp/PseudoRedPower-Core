package com.github.hexirp.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注釈された対象の要素全てに{@link NonNull}が付けられていると見なされる.
 *
 * パッケージに対して付けられた場合、そのパッケージの全ての要素においてデフォルトでNonNullが付けられていると見なされる。
 *
 * @author Hexirp
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.PACKAGE, ElementType.TYPE,
    ElementType.METHOD, ElementType.CONSTRUCTOR,
    ElementType.FIELD, ElementType.LOCAL_VARIABLE })
public @interface NonNullByDefault {
	/**
	 * 対象を指定する.
	 */
	DefaultLocation[] value() default {
	    DefaultLocation.PARAMETER, DefaultLocation.RETURN_TYPE,
	    DefaultLocation.FIELD, DefaultLocation.TYPE_BOUND,
	    DefaultLocation.TYPE_ARGUMENT };
}
