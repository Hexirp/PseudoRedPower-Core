package hexirp.forge.loadable;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;

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
	 * @param value {@link #value}
	 */
	@Setting
	public NamedType(final Type value) {
		this.value = value;
	}
	
	/**
	 * @return {@link #value}
	 */
	@Getting
	public Type value() {
		return value;
	}
	
	@Override
	@Getting
	public String name() {
		return value.name();
	}
}
