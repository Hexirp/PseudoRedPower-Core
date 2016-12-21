package com.github.hexirp.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * パッケージに対して付けられた場合、そのパッケージの全ての要素においてデフォルトでNonNullが付けられていると見なされます.
 *
 * @author Hexirp
 *        
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.PACKAGE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE })
public @interface NonNullByDefault {
	DefaultLocation[] value() default { DefaultLocation.PARAMETER, DefaultLocation.RETURN_TYPE, DefaultLocation.FIELD, DefaultLocation.TYPE_BOUND, DefaultLocation.TYPE_ARGUMENT };
}
