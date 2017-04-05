package hexirp.forge.test;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Nullable;
import hexirp.forge.Registerable;

/**
 * {@link Registerable#register()}が呼び出された記録を表す.
 *
 * @author Hexirp
 */
public class RegisteringLog {
	/** 呼び出された回数. */
	private int count = 0;
	
	/**
	 * 数える.
	 *
	 * @return this
	 */
	@Chaining
	public RegisteringLog inc() {
		count++;
		return this;
	}
	
	@Override
	@Getting
	public boolean equals(@Nullable final Object obj) {
		if (null == obj) return false;
		if (this.getClass() != obj.getClass()) return false;
		final RegisteringLog that = (RegisteringLog) obj;
		return this.count == that.count;
	}
	
	@Override
	@Getting
	public int hashCode() {
		return count * 31;
	}
}
