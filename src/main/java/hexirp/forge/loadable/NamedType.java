package hexirp.forge.loadable;

/**
 * 名前が付いた型を表す.
 *
 * @author Hexirp
 * @param <Type> 名前が付いた型
 */
public class NamedType<Type extends Named> implements Named {
	/** 保持する値. */
	private final Type value;
	
	/**
	 * Setter.
	 *
	 * @param value {@link #value}
	 */
	public NamedType(final Type value) {
		this.value = value;
	}
	
	/**
	 * Getter.
	 *
	 * @return {@link #value}
	 */
	public Type value() {
		return value;
	}
	
	@Override
	public String name() {
		return value.name();
	}
}