package hexirp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * メソッドが副作用を持ち、その他の分類に当てはまらないことを表す. 使用するときは時系列や実行環境に注意を要する。
 * 名前は動詞であることが望ましい。
 *
 * @author Hexirp
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Command {}