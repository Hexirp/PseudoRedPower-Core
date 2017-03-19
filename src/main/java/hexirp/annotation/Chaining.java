package hexirp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * メソッドがオブジェクト内部の情報を変更し、そのオブジェクトを返すことを表す. メソッドチェーンをすることが出来る。
 * オブジェクト内部の情報を変更するという点で副作用を持つ。名前は動詞であることが望ましい。
 *
 * @author Hexirp
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Chaining {}