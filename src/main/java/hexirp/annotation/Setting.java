package hexirp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * コンストラクタが設定を行うことを表す. 副作用を持たず、何度呼び出しても内部の情報は同じである。
 *
 * @author Hexirp
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.CONSTRUCTOR)
public @interface Setting {}