package com.github.hexirp.annotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 関数の引数の定義につけられた場合、その引数はNullではないことが保障される. また、関数そのものの定義につけられた場合、その関数の返り値がNullではないことが保障される.
 *
 * @author Hexirp
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ TYPE_USE })
public @interface NonNull {}