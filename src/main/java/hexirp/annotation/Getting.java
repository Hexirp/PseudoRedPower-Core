package hexirp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * メソッドがオブジェクト内部の情報を加工し、取り出すことを表す. 副作用を持たず、何度呼び出しても内部の情報は同じである。
 * 名前は名詞であることが望ましい。この種類のメソッドは二つ以上チェーンしてはならない。
 *
 * @author Hexirp
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Getting {}