package hexirp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * メソッドの分類を表す.
 *
 * @author Hexirp
 */
@Retention(RetentionPolicy.SOURCE)
@Target({})
public @interface Method {
	/**
	 * コンストラクタが設定を行うことを表す. 副作用を持たず、何度呼び出しても内部の情報は同じである。
	 *
	 * @author Hexirp
	 */
	@Retention(RetentionPolicy.SOURCE)
	@Target(ElementType.CONSTRUCTOR)
	public @interface Setting {}
	
	/**
	 * メソッドがオブジェクト内部の情報を加工し、取り出すことを表す. 副作用を持たず、何度呼び出しても内部の情報は同じである。名前は名詞であることが望ましい。
	 *
	 * @author Hexirp
	 */
	@Retention(RetentionPolicy.SOURCE)
	@Target(ElementType.METHOD)
	public @interface Getting {}
	
	/**
	 * メソッドがオブジェクト内部の情報を変更し、そのオブジェクトを返すことを表す. メソッドチェーンをすることが出来る。名前は動詞であることが望ましい。
	 *
	 * @author Hexirp
	 */
	@Retention(RetentionPolicy.SOURCE)
	@Target(ElementType.METHOD)
	public @interface Chaining {}
}
