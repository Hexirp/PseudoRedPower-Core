package hexirp.annotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注釈された対象がNullである可能性が存在すると見なすことを示す.
 *
 * 関数の引数の定義につけられた場合、その引数はNullである可能性がある。
 * また、関数そのものの定義につけられた場合、その関数の返り値がNullである可能性がある。
 * これはNullチェックを強制する。
 *
 * @author Hexirp
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ TYPE_USE })
public @interface Nullable {}
